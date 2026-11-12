package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
// Wywołanie konstruktora klasy Animal
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "Papuga o imieniu " + name + ", liczba nóg: " + legs;
    }
}
