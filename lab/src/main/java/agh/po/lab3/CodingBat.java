package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(8,13));

    }


    //Warmup-1>close10
    public int close10(int a, int b) {
        int aa = Math.abs(a - 10);
        int bb = Math.abs(b - 10);

        if(aa == bb) {
            return 0;
        }

        if (aa < bb) {
            return a;

        }
        if (aa > bb) {
            return b;

        } else {
            return 0;
        }

    }

}

