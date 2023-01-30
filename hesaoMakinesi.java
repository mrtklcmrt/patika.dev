import java.util.Scanner;

public class hesaoMakinesi {



    static int top (int a, int b ){
        System.out.println(  (a)+(b)  );
        return a+b;
    }


    static int cıkar (int a,int b){
        System.out.println(a-b);
        return a-b;
    }


    static int carp (int a,int b){
        System.out.println(a*b);
        return a*b;
    }


    static int bol (int a , int b){
        System.out.println(a/b);
        return a/b;
    }


    static int power (int a, int b ){
        int resault=1 ;
        for (int c=1 ; c<=b ;c++){
            resault *= a ;

        }
        System.out.println(resault);
        return resault;
    }


    static int faktoriyel (int a){
        int resault=1;
        for (int c=1 ; c<=a ; c++){
            resault *=c ;
        }
        System.out.println(resault);
        return resault;
    }


    static int mod (int a, int b){
        System.out.println(a%b);
        return a%b;
    }


    static void calculate (int a, int b){
        System.out.println("alan= " + a*b + "cevre= " + 2*(a+b));
    }












    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);


        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- cılıs yapma";
        System.out.println(menu);


        int a=0 , b=0 , select;

         do {
             System.out.print("Yapmak istediginiz islemi giriniz: ");
             select = mert.nextInt();

             switch (select) {
                 case 1 -> {
                     System.out.print("ilk sayiyi giriniz: ");
                     a = mert.nextInt();
                     System.out.print("ikinci sayiyi giriniz: ");
                     b = mert.nextInt();
                     top(a, b);
                 }
                 case 2 -> {
                     System.out.print("ilk sayiyi giriniz: ");
                     a = mert.nextInt();
                     System.out.print("ikinci sayiyi giriniz: ");
                     b = mert.nextInt();
                     cıkar(a, b);
                 }
                 case 3 -> {
                     System.out.print("ilk sayiyi giriniz: ");
                     a = mert.nextInt();
                     System.out.print("ikinci sayiyi giriniz: ");
                     b = mert.nextInt();
                     carp(a, b);
                 }
                 case 4 -> {
                     System.out.print("ilk sayiyi giriniz: ");
                     a = mert.nextInt();
                     System.out.print("ikinci sayiyi giriniz: ");
                     b = mert.nextInt();
                     bol(a, b);
                 }
                 case 5 -> {
                     System.out.print("tababan sayisini giriniz: ");
                     a = mert.nextInt();
                     System.out.print("us sayisini giriniz: ");
                     b = mert.nextInt();
                     power(a, b);
                 }
                 case 6 -> {
                     System.out.print("hesaplamak istediginiz sayiyi giriniz: ");
                     a = mert.nextInt();
                     faktoriyel(a);
                 }
                 case 7 -> {
                     System.out.print("bolunen sayiyi giriniz: ");
                     a = mert.nextInt();
                     System.out.print("bolen sayiyi giriniz: ");
                     b = mert.nextInt();
                     mod(a, b);
                 }
                 case 8 -> {
                     System.out.print("kisa kenar giriniz: ");
                     a = mert.nextInt();
                     System.out.print("uzun kenar giriniz: ");
                     b = mert.nextInt();
                     calculate(a, b);
                 }
                 case 0-> {
                     System.out.println("BY");
                     break;
                 }
                 default -> System.out.println("gecerli bir sayi giriniz.");
             }


        }while(select != 0);








    }
}
