package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(8,13));
        System.out.println(cb.makes10(9, 10));
        System.out.println(cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(cb.helloName("Bob"));

    }


    //Warmup-1>close10
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

        } else {
            return 0;
        }

    }//Warmup-1>Makes10
    public boolean makes10(int a, int b) {
        return(a == 10 || b == 10 || a+b == 10);
    }

    //Array-2>countEvens
    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    //String-1>helloName
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

}



