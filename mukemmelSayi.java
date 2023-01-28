import java.util.Scanner;

public class mukemmelSayi {public static void main(String[] args) {
    Scanner mert = new Scanner(System.in);
    System.out.print("Lütfen bir sayi giriniz: ");
    int a = mert.nextInt() ;
    int bolentoplam = 1;


    for (int bolen=2 ; bolen<=a/2 ; bolen++){

        if (a%bolen==0){
                bolentoplam += bolen;
        }

    }
    if (bolentoplam==a) System.out.println("sayi mukemmeldir. ");
    else System.out.println("sayi mukemmel degildir");


  }
  
}
