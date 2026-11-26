package agh.po.symulator;

public class Samochód{
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Pozycja pozycja;

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.pozycja = pozycja;
    }

    public void włącz() {
        silnik.uruchom();
    }
    public void wyłącz() {
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
    }
    public double getAktPredkosc() {
        double A = 0.02; // stały współczynnik ze zdjęcia prowadzącego
        return silnik.getObroty() * skrzynia.getAktPrzelozenie() * A;
    }
    public void jedzDoCelu(P)

    public void wyświetlStan() {
        System.out.println("Obroty silnika: " + silnik.getObroty());
        System.out.println("Aktualny bieg: " + skrzynia.getAktualnyBieg());
        System.out.println("Sprzęgło wciśnięte: " + skrzynia.getSprzęgło().isStanSprzęgła());
        System.out.println("Pozycja: " + pozycja.getPozycja());
        System.out.println("Aktualna prędkość: " + getAktPredkosc() + " km/h");
    }
}
