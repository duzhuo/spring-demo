package com.springincation.springidol;

import java.util.Collection;
import java.util.Map;

/**
 * Created by MrDu on 16/1/7.
 */
public class OneManBand4Map implements Performer {
    public OneManBand4Map() {

    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws Exception {
        for (String key : instruments.keySet() ) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
