import java.util.Scanner;

public class harmonikseri {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz: ");
        int a = mert.nextInt();
        double sonuc = 1;
        for (int i = 2 ; i <= a ; i ++){
            sonuc = sonuc + 1.0/i;
        }
        System.out.println( sonuc );

    }
}
