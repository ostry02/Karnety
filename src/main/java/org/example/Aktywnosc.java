
package org.example;


public class Aktywnosc extends DatyAktywacji {

/*
    public void AktynoscKarnetu(){
        if ( getDataTeraz().isAfter(getDataAktywacji()))
            System.out.println("Karnet aktywny");
        else
            System.out.println("Karnet jeszcze nie aktywowany");
    }
    public void SkonczenieKarnetu(){
        if (getDataTeraz().isAfter(getDataDezaktywacji()))
            System.out.println("Karnet dezaktywowany");
        else
            System.out.println("Karnet aktywny");
    }

 */
    public void DzialanieKarnetu(){
        if (getDataTeraz().isBefore(getDataAktywacji()) && getDataTeraz().isBefore(getDataDezaktywacji()))
            System.out.println("Karnet nieaktywowany");
        else if (getDataTeraz().isAfter(getDataAktywacji()) && getDataTeraz().isBefore(getDataDezaktywacji()))
            System.out.println("Karnet aktywny");
        else if (getDataTeraz().isAfter(getDataAktywacji()) && getDataTeraz().isAfter(getDataDezaktywacji()))
            System.out.println("Karnet stracił ważność");





    }

}


