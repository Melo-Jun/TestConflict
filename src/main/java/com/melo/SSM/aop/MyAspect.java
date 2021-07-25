package com.melo.SSM.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

//    @Before()
    public void before(){
        System.out.println(111);
    }
}
