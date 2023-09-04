package day30_Sayinin_Basamak_Sayisini_Bulma;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int sayi = scanner.nextInt();
        int basamak = 0;

       while (sayi>0){
         basamak++;
         sayi/=10;

       }
        System.out.println(basamak);

    }
}
