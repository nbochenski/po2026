package agh.po.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;
import java.util.Random;

public class Zoo {
    //deklaruje tablice na 100 obiektów typu Animal
    private Animal[] animals = new Animal[100];
    public void fillRandomAnimals() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int choice = random.nextInt(3);
            switch (choice) {
                case 0:
                    animals[i] = new Parrot("Pola_" + i);
                    break;
                case 1:
                    animals[i] = new Dog("Reksio_" + i);
                    break;
                case 2:
                    animals[i] = new Snake("Basia_" + i);
                    break;
            }
        }
    }
    //obliczanie sumy nóg wszystkich zwierząt w tablicy
    public int getTotalLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;
    }
    //  do przetestowania działania
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillRandomAnimals();
        System.out.println("Suma nóg wszystkich zwierząt: " + zoo.getTotalLegs());
    }
}
