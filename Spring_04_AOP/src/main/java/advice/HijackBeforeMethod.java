package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 方法执行前通知
public class HijackBeforeMethod implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HijackBeforeMethod：Before method hijacked!");
    }
}
