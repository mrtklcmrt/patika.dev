import java.util.Scanner;

public class asalSayiYazdirma {
    public static void main(String[] args) {
    boolean control = true ;
    Scanner mert = new Scanner(System.in);
        System.out.print("2,3,");
        //programda cıft sayilari bolen ve sayi olarak hic kontrol ettirmeden atladım
        // bu yuzden 2ve 3 yaptıgım dongulaerde istisna oldu bu yuzdrn direk program basalar baslamaz 2 ve 3 ekrana yazdırdım
        // cıftleri hic kontrol etmedigim icin program 4 kat daha hizli calisti
    for (int i = 5 ; i<100 ; i+=2){


        for (int bolen = 3 ; bolen <i/2 ; bolen += 2){

            if (i%bolen==0){
                control = false;
                break;
            }

        }

        
        if (control==true) System.out.print(i + ",");
        control = true;

    }





    }
}











