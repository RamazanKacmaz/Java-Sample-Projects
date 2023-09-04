package day31_Palindrom;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

    }

        private static boolean isPalindrom ( int sayi){
            int tersSayi = 0;
            int geciciSayi = sayi;

            while (geciciSayi > 0) {
                int sonBasamak = geciciSayi % 10;
                tersSayi = tersSayi * 10 + sonBasamak;
                geciciSayi /= 10;
            }

            return (sayi == tersSayi);

        }
}
