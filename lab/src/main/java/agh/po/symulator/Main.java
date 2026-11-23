package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Sprzęgło sprzęgło = new Sprzęgło("Kia", "Standard");
        SkrzyniaBiegów skrzynia = new SkrzyniaBiegów("Kia", "Manualna 6", 6, sprzęgło);
        Silnik silnik = new Silnik("Kia", "Stinger", 6500);
        Pozycja pozycja = new Pozycja(0, 0);

        Samochód auto = new Samochód(silnik, skrzynia, pozycja);

        auto.włącz();
        auto.wyświetlStan();

        sprzęgło.wciśnij();
        skrzynia.zwiększBieg();
        sprzęgło.zwolnij();
        pozycja.aktualizujPozycję(15.0, 20.0);
        auto.wyświetlStan();

        auto.wyłącz();
        auto.wyświetlStan();
    }
}
