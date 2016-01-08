package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/6.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws Exception {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
