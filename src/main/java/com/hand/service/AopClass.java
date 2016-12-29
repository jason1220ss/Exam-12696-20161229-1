package com.hand.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by jason on 2016/12/29.
 */
@Aspect
@Component
public class AopClass {

    @Before("execution(* com.hand.service.impl.FilmServiceImpl.insert(..))")
     public void before(){
        System.out.println("Before Insert Film Data");
     }
     @After("execution(* com.hand.service.impl.FilmServiceImpl.insert(..))")
     public void after(){
         System.out.println("After Insert Film Data. ");
     }
 }

