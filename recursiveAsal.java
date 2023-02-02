import java.util.Scanner;

public class recursiveAsal {

    static boolean isprime (int a , int b   ){
        if (a==2)return true ;
        else if (a%b==0 || a==1)return false ;
        else if (b==a/2) return true ;
        return isprime(a,b+1);




    }


    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        //recursive metod ile asal kontrolu yapan program
        System.out.print("Lutfen bir sayi giriniz: ");
        int a = mert.nextInt();
        System.out.println(isprime(a,2));


    }
}
