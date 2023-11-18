package aspect;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] methodArguments = joinPoint.getArgs();

            Comment comment = new Comment("Jessica", "I like a tea!");
            Object[] customArguments = {comment};

            logger.info("Method " + methodName + " intercepted with arguments: " + Arrays.asList(methodArguments));

            Object methodReturn = joinPoint.proceed(customArguments);

            logger.info("Method proceeded and returned: " + methodReturn);

            return "FAIL";
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
