package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/13.
 */
public class CriticismEngineImpl implements CriticismEngine {

    private String[] criticismPool;

    public CriticismEngineImpl() {

    }

    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
