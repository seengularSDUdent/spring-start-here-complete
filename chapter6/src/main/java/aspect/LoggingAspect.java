package aspect;

import model.Comment;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(annotation.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            String methodName = joinPoint.getSignature().getName();
            logger.info("Logging Aspect: Method intercepted - " + methodName);
            Object returnedValue = joinPoint.proceed();
            logger.info("Logging Aspect: Method executed succesfully and returned - " + returnedValue);
            return returnedValue;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

