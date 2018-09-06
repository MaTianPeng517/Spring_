package cn.msss.one;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理   实现接口
 * 1.核心接口  InvocationHandler
 */
public class Invocation implements InvocationHandler {


    private Object obje;


    public Object books(Object k){

        this.obje=k;

        return Proxy.newProxyInstance(obje.getClass().getClassLoader(),obje.getClass().getInterfaces(),this);
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Describe invoke = (Describe) method.invoke(obje,args);
        return invoke;
    }

    public static void main(String [] args){
        Invocation invocation=new Invocation();
        Describe books = (Describe) invocation.books(new Books());
        books.describe();
    }

}
