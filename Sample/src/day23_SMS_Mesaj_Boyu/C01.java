package day23_SMS_Mesaj_Boyu;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesajinizi giriniz: ");
        String mesaj = scanner.nextLine();

         double smslengt = mesaj.length()/160.0;

        System.out.println("Mesajiniz : " + mesaj.length()+ " karakterden \n" +
                "olusuyor ve :  " +(int)Math.ceil(smslengt) + " SMS'e bolunebilir" );






    }
}
