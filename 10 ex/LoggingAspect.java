package nm.lab.tenthEx;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* nm.lab.nineEx.service.CustomerService.*(..))")
    public void logBeforeMethods() {
        System.out.println("Logging before method execution");
    }
}
