package com.springincation.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by MrDu on 16/1/12.
 */
@Aspect
public class Magician1 implements MindReader {
    private String thoughts;

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("333 Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

    @Pointcut("execution(* com.springincation.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {

    }
}
