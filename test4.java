import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz:");
        int m = mert.nextInt();
        System.out.print("türkçe notunuzu girinz:");
        int t =mert.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        int k = mert.nextInt();
        System.out.print("fizik notunuzu giriniz:");
        int f = mert.nextInt();
        System.out.print( "biyoloji notunuzu giriniz:");
        int b= mert.nextInt();
        double son = (m+f+k+b+t)/5.0;
        System.out.print("karne ortalamanız:" + son);
        String Vbool = son>=60 ? "  :)sınıfı geçtiniz:)" : "  :(sınıfta kaldınız:(";
        System.out.println(Vbool);
    }
}
