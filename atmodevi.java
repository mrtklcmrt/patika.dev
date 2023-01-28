import java.util.Scanner;

public class atmodevi {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        int right = 3 , option , bakiye= 2500;
        String  pasword ,username;
        boolean control = false ;
        while (right!=0){
            System.out.println("kullanıcı adi");
            username = mert.nextLine();
            System.out.println("şifre ");
            pasword  = mert.nextLine();
            if (pasword.equals("160150")&& username.equals("mert") ){
                control = true;
                right = 0 ;
            }else if (right == 0 ) {

                System.out.println("Kartınız bloke edilmiştir.\nLütfen banka ile iletişime geçiniz.");
            } else {
                right--;
                System.out.println(" Tekrar deneyiniz. \nKalan hakkiniz " + right);
            }

        }if (control == true){
            do {
                System.out.println("HOŞGELDİN."); System.out.println("Yapmak istediğininz işlemi numara şeklinde giriniz \n1->Para yatırma.\n2->Para çekme.\n3->Bakiye sorgulama.\n4->Çikiş yapma." );
                option = mert.nextInt();

                switch (option){
                    case 1:
                        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                        bakiye += mert.nextInt();
                        System.out.println(bakiye);
                        break;
                    case 2 :
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        bakiye -= mert.nextInt();
                        if (bakiye>=0){
                            System.out.println("Kalan bakiye: " + bakiye);
                        }else {
                            System.out.println("Bakiye yetersiz.Lütfen geçerli bir tutar giriniz.");
                        }
                        break;
                    case 3 :
                        System.out.println("Bakiyeniz: " + bakiye);
                        break;
                    case 4 :
                        System.out.println("Bizi tercih ettiğiniz için teşşekür ederiz.\nTekrar görüşmek dileğiyle.");
                        break;

                }



            }while (option != 4);

        }





    }
}
