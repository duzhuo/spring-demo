package com.springincation.springidol;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by MrDu on 16/1/11.
 */
public class Audience {
    public void taskSeats(){
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphone.");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " milliseconds.");
        }catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
