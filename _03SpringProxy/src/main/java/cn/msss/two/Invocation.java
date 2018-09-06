package cn.msss.two;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB  继承类 实现接口
 * 1.核心类Enhancer
 * 2.核心接口核心接口  MethodInterceptor ，extends Callback
 */
public class Invocation  implements MethodInterceptor{


    private Enhancer enhancer=new Enhancer();

    /**
     * 根据用户传递的委托类，返回一个代理类
     */
    public Object describe(Class clazz){
        //设置公共的父类或者接口
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *
     * @param o     委托类
     * @param method    方法
     * @param objects   方法参数
     * @param methodProxy   方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强");
        Object o1 = methodProxy.invokeSuper(o, objects);
        return o1;
    }

    public static void main(String [] args){
        Invocation invocation=new Invocation();
        Describe describe = (Describe) invocation.describe(Books.class);
        describe.describe();
    }
}
