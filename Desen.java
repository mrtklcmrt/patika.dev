import java.util.Scanner;
public class Desen {



    static int recDesen (int a ,int b ,boolean control){

        System.out.print(" " + a);

        if (a>0 && control==true){
            recDesen(a-5 ,b , control);


        }else if (  a!=b){

              recDesen(a+5 , b ,false);


        }
        return b ;
    }



    static void desen (int a){

        recDesen(a,a,true);


    }




    public static void main(String[] args) {
        int a;

        Scanner mert = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        a = mert.nextInt();
        desen (a);


    }


}
