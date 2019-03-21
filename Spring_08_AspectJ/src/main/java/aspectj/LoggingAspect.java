package aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    /*
        此例 Advice 和 Pointcut 结合在一起，
        类中的具体方法 logBefore 和 logAfter 即为 Advice ，是要注入的代码，
        Advice 方法上的表达式为 Pointcut 表达式，即定义了切入点，
        下例中 @Before 注释的表达式代表执行 CustomerBo.addCustomer 方法时注入 logBefore 代码；
    */
    @Before("execution(public * aspectj.CustomerBo.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore() is running...");
        System.out.println("hijacked：" + joinPoint.getSignature().getName());
        System.out.println("#########################");
    }

    @After("execution(public * aspectj.CustomerBo.deleteCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running...");
        System.out.println("hijacked：" + joinPoint.getSignature().getName());
        System.out.println("########################");
    }

}
