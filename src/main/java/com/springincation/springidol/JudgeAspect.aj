package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/13.
 */
public aspect JudgeAspect {

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    public JudgeAspect() {}

    pointcut performance() : execution(* perform(..));

    after() returning() : performance() {
        System.out.println();
    }
}
