package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class HijackAroundMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name：" + methodInvocation.getMethod().getName());
        System.out.println("Method arguments：" + Arrays.toString(methodInvocation.getArguments()));
        // 相当前置通知
        System.out.println("HijackAroundMethod：Before method hijacked!");
        try {
            // 相当于调用CustomerService的方法
            Object result = methodInvocation.proceed();
            // 相当于后置通知
            System.out.println("HijackAroundMethod：After method hijacked!");
            return result;
        } catch (IllegalArgumentException e) {
            // 相当于异常通知
            System.out.println("HijackAroundMethod：Throw exception hijacked!");
            throw e;
        }

    }
}
