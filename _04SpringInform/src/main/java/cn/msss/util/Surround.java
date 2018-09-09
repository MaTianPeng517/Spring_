package cn.msss.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Surround implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("------------------------------------------");
        System.out.println("进入环绕增强00000");
        System.out.println(methodInvocation+"00000");
        System.out.println(methodInvocation.proceed()+"00000");
        Object proceed = methodInvocation.proceed();
        proceed="呵呵";
        System.out.println("------------------------------------------");
        return proceed;
    }
}
