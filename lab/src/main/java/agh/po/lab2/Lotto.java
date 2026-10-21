package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> twojeTypy = new ArrayList<>();
        for (String arg : args) {
            twojeTypy.add(Integer.parseInt(arg));
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        for (int i=0; i < 6; ) {
            int liczba = random.nextInt(49) + 1;
            if(!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
                i++;
            }
        }

        int trafienia = 0;
        for(int typ : twojeTypy) {
            if (wylosowane.contains(typ)) {
                trafienia++;
            }

        }
        System.out.println("Twoje typy:" + twojeTypy);
        System.out.println("Wylosowane liczby:" + wylosowane);
        System.out.println("liczba trafien:" + trafienia);
    }
}
