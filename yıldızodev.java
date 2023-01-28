import java.util.Scanner;

public class yıldızodev {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.println("Piramit in kac katli olacagini giriniz" );
        int a = mert.nextInt();
        for (int floor=1 ; floor<=a ; floor++ ){
            for (int space = 1 ; space <=a-floor ; space++){
                System.out.print(" ");
            }
             for (int star = 1 ; star<=(floor*2)-1 ; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int underflour = 1 ; underflour<=a-1 ; underflour++){
            for(int underspace = 1 ; underspace <= underflour ; underspace++ ){
                System.out.print(" ");
            }
            for (int understar =1 ; understar<=(2*a)-1-(2*underflour); understar++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
