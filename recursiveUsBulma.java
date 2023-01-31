import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class recursiveUsBulma {

    static int power(int a , int b ){
        int resault = 1;
        for(int i = 1  ; i <= b ; i++ ){
            resault *= a;
        }
        return  resault ;

    }









    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.print("US HESAP YAPMA \nTaban sayisini giriniz: ");
        int a = mert.nextInt();
        System.out.print("Us sayisini giriniz: ");
        int b = mert.nextInt();
        System.out.println( power(a,b)  ); ;



    }
}
