package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {

        Aktywnosc aktywnosc = new Aktywnosc();
        DatyAktywacji datyAktywacji = new DatyAktywacji();

        datyAktywacji.setDataAktywacjis("10/10/2023");
        datyAktywacji.setDataDezaktywacjis("10/10/2011");

        System.out.println(datyAktywacji.getDataAktywacji());
        System.out.println(aktywnosc.getDataAktywacji());
        aktywnosc.AktynoscKarnetu();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 15);

        System.out.println("Date set to: " + calendar.getTime());




        Cena cena = new Cena(200);
        System.out.println(cena.cenaKarnetu);


    }
}