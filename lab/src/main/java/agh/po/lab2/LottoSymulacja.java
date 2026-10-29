package agh.po.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoSymulacja {
    public static void main(String[] args) {

        // definiujemy 6 unikalnych liczb z zakresu 1-49
        Set<Integer> userNumber = Set.of(1, 2, 5, 6, 7, 9);
        long attempts = 0;
        boolean isHit = false;

        //pomiar czasu rozpoczecia losowania
        long startTime = System.currentTimeMillis();

        //petla ktora wykonuje sie do momentu trafienia 6/6
        while(!isHit) {
            attempts++;
            Set<Integer> drawnNumbers = drawLottoNumbers();

            //spr czy to co sie wylosowalo jest takie same jak nasze liczby co podalismy
            if(drawnNumbers.containsAll(userNumber)) {
                isHit = true;
            }

        }
        //pomiar czasu zakonczenina losowania
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        //wyswietlenie wynikow
        double totalSeconds = totalTime /1000.0;  // to dzielenie przez 1000.0 przelicza milisekundy na  sekundy
        System.out.println("laczny czas dzialania programu:" + totalSeconds + " s ");
        System.out.println("liczba losowan do trafienia wszystkich liczb:"+attempts);

    }
    //metoda drawlottonubers zdefiniowana poza main() ale wewnatrz klasy lottosymulacja
    private static Set<Integer> drawLottoNumbers() {
        List<Integer> pool = new ArrayList<>();
        for(int i = 1; i <= 49; i++){
            pool.add(i);
        }
        Collections.shuffle(pool);
        return new HashSet<>(pool.subList(0, 6));
    }

}
