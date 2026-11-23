package agh.po.symulator;

public class Sprzęgło extends Komponent{
    private boolean stanSprzęgła;

    public Sprzęgło(String producent, String model) {
        super(producent, model);
        this.stanSprzęgła = false;
    }

    public void wciśnij() {
        this.stanSprzęgła = true;
    }

    public void zwolnij() {
        this.stanSprzęgła = false;
    }

    public boolean isStanSprzęgła() {
        return stanSprzęgła;
    }
}
