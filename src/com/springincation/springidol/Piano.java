package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/7.
 */
public class Piano implements Instrument {
    public Piano() {

    }
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
