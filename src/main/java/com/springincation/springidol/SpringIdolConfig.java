package com.springincation.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MrDu on 16/1/9.
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler(20);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells 111");
        return kenny;
    }
}
