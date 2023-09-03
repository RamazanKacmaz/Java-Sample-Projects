package day19_Faktoriyel_Hesapla;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen fakroriyeli hesaplancak bir sayi giriniz.");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <sayi ; i++) {
            faktoriyel *=i;
        }
        System.out.println(faktoriyel);
    }
}
