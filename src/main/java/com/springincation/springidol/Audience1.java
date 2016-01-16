package com.springincation.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by MrDu on 16/1/11.
 */
@Aspect
public class Audience1 {
    @Pointcut("execution(* com.springincation.springidol.Performer.perform(..))")
    public void performance() {

    }

    @Before("performance()")
    public void taskSeats(){
        System.out.println("111 The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("111 The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("111 CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("111 Boo! We want our money back!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("222 A");
            System.out.println("222 B.");
            long start1 = System.currentTimeMillis();

            joinPoint.proceed();

            long end1 = System.currentTimeMillis();
            System.out.println("222 C");
            System.out.println("222 D " + (end1 - start1) + " milliseconds.");
        }catch (Throwable t) {
            System.out.println("222 E ");
        }
    }
}
