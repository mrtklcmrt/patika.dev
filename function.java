public class function {

    static int power (int base , int power){
        int resault = 1;
        for (int i = 1; i<=power; i++ ){
            resault *= base;
        }
        return resault;
    }


    public static void main(String[] args) {

       int kare = power(5,2);
        System.out.println(kare);



    }
}
