package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/6.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws Exception {
        super.perform();
        System.out.println("While reciting ...");
        poem.recite();
    }
}
