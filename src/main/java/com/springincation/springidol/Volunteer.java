package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/12.
 */
public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
