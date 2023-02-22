package org.example;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        /*
        DatyAktywacji dataAktywacji = new DatyAktywacji();
        dataAktywacji.setDataAktywacji(LocalDate.of(2023,2,16));
        dataAktywacji.setDataDezaktywacji(LocalDate.of(2023,2,20));
        System.out.println(dataAktywacji.getDataTeraz());
        System.out.println(dataAktywacji.getDataAktywacji());
        System.out.println(dataAktywacji.getDataDezaktywacji());

         */

/*
        Aktywnosc aktywnosc = new Aktywnosc();
        aktywnosc.setDataAktywacji(LocalDate.of(2023,2,20));
        aktywnosc.setDlugoscDzialaniaDni(30);
        Cena cena = new Cena();
        aktywnosc.setDataDezaktywacji(aktywnosc.dataAktywacji.plusDays(aktywnosc.getDlugoscDzialaniaDni()));
        aktywnosc.DzialanieKarnetu();
        cena.cenyKarnetow();

        System.out.println(aktywnosc.getDataTeraz());

 */
        Cena cena = new Cena();
        cena.setDataAktywacji(LocalDate.of(2023,2,20));
        cena.setDlugoscDzialaniaDni(10);
        cena.setDataDezaktywacji(cena.dataAktywacji.plusDays(cena.getDlugoscDzialaniaDni()));
        cena.DzialanieKarnetu();

        System.out.println("Data aktywacji karnetu: " + cena.getDataAktywacji());
        System.out.println("Dni aktywnego karnetu: " + cena.getDlugoscDzialaniaDni());
        System.out.println("Data dezaktywacji: " + cena.getDataDezaktywacji());
        System.out.println("Dzisiejsza Data: " + cena.getDataTeraz());
        cena.cenyKarnetow();


        }
}