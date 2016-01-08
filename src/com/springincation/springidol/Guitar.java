package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/7.
 */
@StringedInstrument
public class Guitar implements Instrument {
    public Guitar() {

    }
    @Override
    public void play() {
        System.out.println("Guitar Guitar Guitar");
    }
}
