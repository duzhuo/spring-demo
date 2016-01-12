package com.springincation.springidol;

/**
 * Created by MrDu on 16/1/6.
 */
public class Stage {
    private Stage() {

    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
