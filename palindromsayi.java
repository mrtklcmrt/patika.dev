import java.util.Scanner;

public class palindromsayi {


//a parametresi girilen sayinin kendisi , b parametresi sayinin kacinci basamaginin bulunacagini soyler
    static int mod (int a , int b){
        int s = 0;
        while (b !=0){
            if (b==1){
                s = a %10;
                b--;
                break;
            }
            a = a/10;
            b--;
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);


        System.out.print("Lutfen bır sayi giriniz: ");
        int a = mert.nextInt(), basnumb = 0 ;
        int b = a;
        boolean control = true ;

        //asagidaki while dongusu sayinin basamak numarasini bulur
        while (b!=0){
            b = b/10;
            basnumb++;
        }


        //buradaki dongu sayinin basamak sayisinin yarısı kadar doner cunku bu program sayiyi ikiye bolerek control saglıyo
        // tek basamaklı sayilarda ortadaki sayi sagsan ve soldan da okununca aynı olsugu icin sorun olmuyo
        for (int dongusay = 1  ;dongusay<=basnumb/2;dongusay++){
            int dongusay2 = basnumb -(dongusay-1);//songusay2 degiskeni sayiyi ikiye bolunce dongusay ın karsındaki sayiyi bulur

            int x = mod(a ,dongusay2);
            int y = mod(a,dongusay);

            //x ve y degiskenkleri metodda bulunan sayilara esitlenir ikisi esitse dongu devam eder degilse direkk program  durur
            if (x!=y){
             control = false;
            }

            
        }
        if (control == true ) System.out.println("sayi palindromdur. ");
        else System.out.println("Sayi palindrom degildir. ");



    }
}
