import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        int max = 0 ,min = 0;
        System.out.print("verimiz kaç sayıdan oluşacak: ");
        int a = mert.nextInt();
        for (int i = 1 ; i<=a ; i++){
            System.out.println(i + ". Sayıyı giriniz lütfen: ");
            int control = mert.nextInt();
            if (control >= max ){
                max = control ;
            }else if ( control < min){
                min = control;
            }
        }
        System.out.println("En büyük değer: " + max + "\nGirilen en küçük değer: " + min);
    }
}
