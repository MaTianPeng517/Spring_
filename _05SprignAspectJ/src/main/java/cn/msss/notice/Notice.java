package cn.msss.notice;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Notice {
    @Before("execution(* *..service..*.eat())")
    public void bo(){
        System.out.println("前置");
    }
}
