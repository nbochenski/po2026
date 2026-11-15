package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(8, 13));
        System.out.println(cb.makes10(9, 10));
        System.out.println(cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(cb.helloName("Bob"));

        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("a", "aaa");
        sampleMap.put("b", "aaa");
        sampleMap.put("c", "apple");
        System.out.println(cb.mapAB2(sampleMap));

        System.out.println(cb.wordCount(new String[]{"kot", "pies", "kot", "ptak", "pies"}));
    }

    // Warmup-1>close10
    public int close10(int a, int b) {
        int aa = Math.abs(a - 10);
        int bb = Math.abs(b - 10);

        if (aa == bb) {
            return 0;
        }
        if (aa < bb) {
            return a;
        }
        if (aa > bb) {
            return b;
        }
        return 0;
    }

    // Warmup-1>makes10
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    // Array-2>countEvens
    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // String-1>helloName
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    // Map-2>mapAB2
    public Map<String, String> mapAB2(Map<String, String> map) {
        Map<String, String> wynik = new HashMap<>();
        for (String key : map.keySet()) {
            wynik.put(key, map.get(key));
        }

        if (wynik.containsKey("a") && wynik.containsKey("b")) {
            String valA = wynik.get("a");
            String valB = wynik.get("b");
            if (valA.equals(valB)) {
                wynik.remove("a");
                wynik.remove("b");
            }
        }

        return wynik;
    }

    // Map-2>wordCount
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> wynik = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String slowo = strings[i];
            if (wynik.containsKey(slowo)) {
                int obecnaLiczba = wynik.get(slowo);
                wynik.put(slowo, obecnaLiczba + 1);
            } else {
                wynik.put(slowo, 1);
            }
        }

        return wynik;
    }
}



