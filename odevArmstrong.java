import java.util.Scanner;

public class odevArmstrong {

    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.print(" bir sayi giriniz");
        double a = mert.nextInt();
        int sonuc = 0;
        while ( (a/10)>=0.1 ){
            double mod = a % 10;
            sonuc += mod;
            a= a/10;
        }
        System.out.println("basamak sayiları toplami = " + sonuc);
    }
}
