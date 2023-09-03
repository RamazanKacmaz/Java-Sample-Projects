package day15_Cift_Sayilari_Bulma;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int girilenSayi = scanner.nextInt();
        int ortalama = 0;
        int sayac = 0;


        for (int i = 1; i <girilenSayi ; i++) {
            if (i % 4 == 0 && i % 5 == 0 ){
                System.out.print(i + " ");
               ortalama += i;
               sayac++;
            }
        }
        System.out.println("\n_______________");
        System.out.println(ortalama);
        System.out.println(sayac);
        System.out.println("Girilen sayinin ortlmasi : " + (ortalama/sayac));

    }
}
