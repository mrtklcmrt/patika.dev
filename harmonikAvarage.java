package ARRAY;

import java.util.Scanner;

public class harmonikAvarage {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun: ");

        int a = mert.nextInt();
        double[] array = new double[a];
        double resault = 0;

        for (int b = 0; b < array.length; b++) {
            System.out.print((b + 1) + ".eleman: ");
            array[b] = mert.nextInt();
            resault += 1 / array[b];

        }
        System.out.println("dizinin harmonik ortalamasi: " + array.length / resault);


    }
}
