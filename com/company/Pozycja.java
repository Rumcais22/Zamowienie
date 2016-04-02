package com.company;

public class Pozycja {
    protected String nazwaTowaru;
    protected int ileSztuk;
    protected double cena;
    double Wartosc;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena ){
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    public double obliczWartosc() {
        Wartosc = ileSztuk * cena;
        return Wartosc;
    }
    @Override
    public String toString() {
        return "pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", ileSztuk=" + ileSztuk +
                ", cena=" + cena +
                ", Wartosc=" + Wartosc +
                '}';
    }
}





