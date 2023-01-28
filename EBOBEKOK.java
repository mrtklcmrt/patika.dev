import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        //girilen iki sayinin ebob ve ekoknu hesaplar
        int b ,  k ;




        System.out.println("ebob ve ekok hesaplamak icin iki sayi giriniz: ");
        System.out.print("Lutfen ilk sayiyi giriniz: ");
        int x = mert.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        int y = mert.nextInt();

        //sayilarin hangisi buyuk hangisi kuç
        // cuk bulmak icin if kullandım
        if (x<y){
             b = y ;
             k = x ;
        }
        else {
            b = x ;
            k = y ;
        }


        // eger sayilar esitse direk mesaj verip program bitecek
        if (x!=y & x!=0 & y!=0 ){

            //sayilarni ebobunu bulan dongu
            for (int bolen = k ; bolen>0 ; bolen--){


                if (k%bolen==0 && b%bolen==0 ){

                    System.out.println("EBOB(" + b + "," + k + ") =  " + bolen  );
                    break ;
                }
            }




            //sayilarin ekokunu bulan dongu

            //bolunen degiskeni buyuk sayidan buyuk sayı ile kucuk sayının modunun cıkartılmasıyla bulunur
            //ustune her defasinda kucuk sayi eklenerek kontrol edilir bu sayede program aradaki katları sayilari atlayarak daha hızlı calisir
            int bolunen = b-b%k;
            while (1!=0){

                if (bolunen%b==0 && bolunen%k==0){
                    System.out.println("EKOK(" + b + "," + k + ") =  " + bolunen);
                    break;
                }

                bolunen+=k;
            }



        }else if (x==y) System.out.println("iki sayi aynidir dolayisiyla ebobda ekokda sayilarin kendisine esit olur. ");
         else System.out.println("sayilardan herhangibiri veya ikiside 0 olamaz ");
    }
}
