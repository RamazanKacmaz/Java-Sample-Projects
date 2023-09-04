package day21_Armstrong_Sayi_Bulma;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

       /* int number = 407;
        int digit = 0;
        int temp = number;

        do {
            temp = temp / 10;
            digit++;
        }while (temp != 0);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        int number =  sayi;
        int temp = number;

        int n = 3;
        int total = 0;


        while (temp != 0){
           int digit = temp % 10;
           int digitPow = 1;

            for (int i = 1; i <= n ; i++) {
                digitPow *= digit;
            }
            total+=digitPow;
            temp = temp/10;
        }

        if (total == number){
            System.out.println(number + " Armstrong dur");
        }else {
            System.out.println("Degildir");
        }



    }
}
