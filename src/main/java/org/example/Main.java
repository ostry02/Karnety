package org.example;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        DatyAktywacji dataAktywacji = new DatyAktywacji();
        dataAktywacji.setDataAktywacji(LocalDate.of(2023,2,16));
        dataAktywacji.setDataDezaktywacji(LocalDate.of(2023,2,20));
        System.out.println(dataAktywacji.getDataTeraz());
        System.out.println(dataAktywacji.getDataAktywacji());
        System.out.println(dataAktywacji.getDataDezaktywacji());


        Aktywnosc aktywnosc = new Aktywnosc();
        aktywnosc.setDataAktywacji(LocalDate.of(2023,2,7));
        aktywnosc.setDataDezaktywacji(aktywnosc.dataAktywacji.plusDays(10));
        aktywnosc.AktynoscKarnetu();
        aktywnosc.SkonczenieKarnetu();


        }


}