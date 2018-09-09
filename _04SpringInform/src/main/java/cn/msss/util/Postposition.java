package cn.msss.util;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Postposition implements AfterReturningAdvice {

    /**
     *
     * @param returnValue   主业务的返回值
     * @param method         主业务方法
     * @param args           主业务参数
     * @param target         目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("---------------华丽的分割线---------------------------");
        System.out.println("进入后置通知");
        System.out.println(returnValue+"++");
        System.out.println(args+"++");
        System.out.println(target.getClass().getName()+"++");
    }
}
