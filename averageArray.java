package ARRAY;

import java.util.Scanner;

public class averageArray {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);

        System.out.print("dizideki eleman sayisi kac olsun: ");
        int a = mert.nextInt();
        int[] mert1 = new int[a];
        for (int value = 0; value < mert1.length; value++) {
            mert1[value] = mert.nextInt();
        }
        for (int b : mert1) {
            System.out.print(b + ", ");

        }
        double resault = 0;
        for (int k : mert1) {
            resault += k;

        }
        double avarage = resault/mert1.length;
        System.out.println( " \n dizimizin ortalamasi: " + avarage);
    }
}
