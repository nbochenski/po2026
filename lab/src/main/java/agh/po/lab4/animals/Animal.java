package agh.po.lab4.animals;

public abstract class Animal {
    protected String name;
    protected  int legs;

    //Konstruktor przypisujący imię i liczbę nóg
    public Animal(String name, int legs) {
        this.name =  name;
        this.legs = legs;
    }
    public int getLegs() {// Metoda zwracająca liczbę nóg
        return legs;
    }
    public abstract String getDescription();
}
