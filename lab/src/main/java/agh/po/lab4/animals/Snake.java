package agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake(String name) {
        // Wywołanie konstruktora klasy Animal
        super(name, 0);
    }

    @Override
    public String getDescription() {
        return "Wąż o imieniu " + name + ", liczba nóg: " + legs;
    }
}
