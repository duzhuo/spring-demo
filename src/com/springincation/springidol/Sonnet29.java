package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/6.
 */
public class Sonnet29 implements Poem {

    public Sonnet29(){

    }

    private static String [] LINES = {
            "1",
            "2",
            "3",
            "4",
            "5"
    };

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
