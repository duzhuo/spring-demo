package com.springincation.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MrDu on 16/1/6.
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer performer = (Performer) context.getBean("duke");
        try {
            performer.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thinker thinker = (Thinker) context.getBean("volunteer");
        Magician magician = (Magician) context.getBean("magician");
        thinker.thinkOfSomething("NEVER GIVE UP! NERVER GIVE UP!");
        System.out.println(magician.getThoughts());

        System.out.println("-----------------------declare-parents----------------------------------------");

        Contestant contestant = (Contestant) context.getBean("duke");
        contestant.receiveAward();

//        PoeticJuggler poeticJuggler = (PoeticJuggler) context.getBean("poeticDuke");
//        try {
//            poeticJuggler.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Stage stage = (Stage) context.getBean("theStage");
//            System.out.println(stage.toString());
//        }
//
//        for (int i = 0; i < 10; i++) {
////            Juggler juggler = new Juggler();
//            System.out.println(performer.toString());
//        }
//
//        for (int i = 0; i <10; i++) {
//            Ticket ticket = (Ticket) context.getBean("ticket");
//            System.out.println(ticket.toString());
//        }
//
//        Auditorium auditorium = (Auditorium) context.getBean("auditorium");
//        auditorium.sing();
//
//        System.out.println("-----------------------kenny----------------------------------------");
//        Performer kenny = (Performer) context.getBean("kenny");
//        try {
//            kenny.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("-----------------------kenny2----------------------------------------");
//
//        Performer kenny2 = (Performer) context.getBean("kenny2");
//        try {
//            kenny2.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("----------------------------------------");
//
//        Performer hank = (Performer) context.getBean("hank");
//        try {
//            hank.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("----------------------------------------");
//
//        Performer hank4Map = (Performer) context.getBean("hank4map");
//        try {
//            hank4Map.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("----------------------------------------");
//
//        Performer carl = (Performer) context.getBean("carl");
//        try {
//            carl.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("-----------------------carl1----------------------------------------");
//
//        Performer carl1= (Performer) context.getBean("carl1");
//        try {
//            carl1.perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
