import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        System.out.print("Ters ucgen kac katli olsun: ");
        int floor = mert.nextInt();
        for (int whicfloor = floor ; whicfloor>0 ; whicfloor--){

            for (int space = 1 ; space <= floor-whicfloor; space++) System.out.print(" ");



            for (int star = 1 ; star<=(2*whicfloor)-1 ; star++)System.out.print("*");

            System.out.println(" ");

        }


    }
}
