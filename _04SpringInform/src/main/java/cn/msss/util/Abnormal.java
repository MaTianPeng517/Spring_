package cn.msss.util;

import org.springframework.aop.ThrowsAdvice;

public class Abnormal implements ThrowsAdvice {

    public void afterThrowing(Exception ex){
        System.out.println("进入异常通知");
        System.out.println("嘟嘟嘟-警告-出现错误");
        System.out.println(ex.getMessage());
    }
}
