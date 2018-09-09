package cn.msss.util;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强
 */
public class Notification implements MethodBeforeAdvice {


    /**
     *
     * @param method  执行方法
     * @param objects 参数
     * @param o        目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("进入前置对象--");
        System.out.println(o.getClass().getName()+"对象路径--");
        System.out.println(o.getClass().getSimpleName()+"对象类型--");
        System.out.println("---------------华丽的分割线---------------------------");
    }
}
