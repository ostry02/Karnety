package org.example;

public class Cena extends Aktywnosc{
    public float cenaKarnetu;

    public float getCenaKarnetu() {
        return cenaKarnetu;
    }

    public void setCenaKarnetu(float cenaKarnetu) {
        this.cenaKarnetu = cenaKarnetu;
    }

    public void cenyKarnetow(){
        if (getDlugoscDzialaniaDni() !=0 && getDlugoscDzialaniaDni() <5){
            setCenaKarnetu(100);
            System.out.println("Cena karentu to: " + getCenaKarnetu());
        } else if (getDlugoscDzialaniaDni()<=5 && getDlugoscDzialaniaDni()<10) {
            setCenaKarnetu(200);
            System.out.println("Cena karentu to: " + getCenaKarnetu());
        } else if (getDlugoscDzialaniaDni() <=10 && getDlugoscDzialaniaDni() <20) {
            setCenaKarnetu(300);
            System.out.println("Cena karentu to: " + getCenaKarnetu());
        } else if (getDlugoscDzialaniaDni() <=20 && getDlugoscDzialaniaDni() <=30)  {
            setCenaKarnetu(350);
            System.out.println("Cena karentu to: " + getCenaKarnetu());
        }
    }

}
