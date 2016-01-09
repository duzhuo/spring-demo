package com.springincation.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by MrDu on 16/1/7.
 */
//@Component("kenny")
public class Instrumentalist implements Performer {
    @Override
    public void perform() throws Exception {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

//    @Value("如果有来生")
    @Value("#{configProperties[myFavoriteSong]}")
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Autowired
//    @Qualifier("saxophone")
    @StringedInstrument
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

//    @Autowired
//    public void setInstrument(Instrument instrument) {
//        this.instrument = instrument;
//    }
}
