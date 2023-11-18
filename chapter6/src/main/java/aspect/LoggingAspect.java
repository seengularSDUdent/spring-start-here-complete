package aspect;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(annotation.ToLog)", returning = "returnedValue")
    public void log(Object returnedValue) throws Throwable {
        try {
            logger.info("Method executed succesfully and returned: " + returnedValue);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

