package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            logger.info("Method intercepted");
            joinPoint.proceed();
            logger.info("Method proceeded");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
