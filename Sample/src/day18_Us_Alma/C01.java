package day18_Us_Alma;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir us alincak sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println("lutfen us olacak bir sayi giriniz");
        int us = scanner.nextInt();

        int result = 1;

        int i = 1;

        while (i <= us){
            result *= sayi;
            i++;
        }
        System.out.println(result);
    }
}
