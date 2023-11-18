package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(annotation.ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        logger.info("Security Aspect: Method intercepted - " + methodName);

        Object returnedValue = null;
        try {
            returnedValue = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        logger.info("Security Aspect: Method executed and returned - " + returnedValue);

        return returnedValue;
    }
}
