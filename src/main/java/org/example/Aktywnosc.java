
package org.example;


public class Aktywnosc extends DatyAktywacji {
    public void DzialanieKarnetu(){
        if (getDataTeraz().isBefore(getDataAktywacji()) && getDataTeraz().isBefore(getDataDezaktywacji()))
            System.out.println("Karnet nieaktywowany");
        else if (getDataTeraz().isAfter(getDataAktywacji()) && getDataTeraz().isBefore(getDataDezaktywacji()))
            System.out.println("Karnet aktywny");
        else if (getDataTeraz().isAfter(getDataAktywacji()) && getDataTeraz().isAfter(getDataDezaktywacji()))
            System.out.println("Karnet stracił ważność");
    }
}


