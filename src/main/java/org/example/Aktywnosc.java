
package org.example;


import java.text.ParseException;

public class Aktywnosc extends DatyAktywacji{
    public boolean sprwdzenieAktywnosci;
    public void AktynoscKarnetu(){
        if (sprwdzenieAktywnosci == getDataDeaktywacji().before(dataTeraz)){
            System.out.println("Karnet aktywny");
        }else{
            System.out.println("Karnet nieaktywny");
        }

    }


    public Aktywnosc() throws ParseException {
    }
}


