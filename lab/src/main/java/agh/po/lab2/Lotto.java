package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        for (int i=0; i < 6; ) {
            int liczba = random.nextInt(49) + 1;
            if(!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
                i++;
            } else {

            }
        }
        System.out.println("Wylosowane liczby:" + wylosowane);
    }
}
