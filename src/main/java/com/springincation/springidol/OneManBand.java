package com.springincation.springidol;

import java.util.Collection;

/**
 * Created by MrDu on 16/1/7.
 */
public class OneManBand implements Performer {
    public OneManBand() {

    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws Exception {
        for (Instrument instrument : instruments ) {
            instrument.play();
        }
    }
}
