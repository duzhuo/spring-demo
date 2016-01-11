package com.springincation.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by MrDu on 16/1/7.
 */
@StringedInstrument
@Component
public class Guitar implements Instrument {
    public Guitar() {

    }
    @Override
    public void play() {
        System.out.println("Guitar Guitar Guitar !!!");
    }
}
