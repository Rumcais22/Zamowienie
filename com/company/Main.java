package com.company;

public class Main {
    public static void main(String[] args) {
        Pozycja test= new Pozycja("Piwo",10,3.2);
        System.out.print(test);
        Pozycja test1= new Pozycja("Wino",6,1.5);
        System.out.print (test1);
        zamowienie z = new zamowienie(10);
        z.dodajPozycje(test);
        z.dodajPozycje(test1);
        System.out.println(z);
    }
}

