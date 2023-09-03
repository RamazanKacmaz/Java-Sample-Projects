package day17_Kuvvet_Bulan;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N degeri giriniz");
        int n = scanner.nextInt();

        System.out.println("K degeri giriniz");
        int k = scanner.nextInt();

        for (int i = 1; i <=k ; i*=n) {
            System.out.println(i);
        }


    }
}
