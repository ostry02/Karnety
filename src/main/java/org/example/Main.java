package org.example;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
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