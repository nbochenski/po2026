package agh.po.symulator;

public class Samochód{
    private Silnik silnik;

    private SkrzyniaBiegów skrzynia;
    private Pozycja aktualnaPozycja;
    private String nrRejest;
    private String model;
    private String predkoscMax;

    public Samochód(Silnik silnik,SkrzyniaBiegów skrzynia, Pozycja aktualnaPozycja, String nrRejest, String model, double predkoscMax){
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;

    }
}
