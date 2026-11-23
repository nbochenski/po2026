package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent{
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzęgło sprzęgło;

    public SkrzyniaBiegów(String producent, String model, int iloscBiegow, Sprzęgło sprzęgło) {
        super(producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzęgło = sprzęgło;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public void zwiększBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }
    public void zmniejszBieg() {
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }

    public void zerujBieg() {
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public Sprzęgło getSprzęgło() {
        return sprzęgło;
    }
    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }
}
