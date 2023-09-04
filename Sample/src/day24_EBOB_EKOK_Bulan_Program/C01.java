package day24_EBOB_EKOK_Bulan_Program;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ebob ve ekok icin iki sayi giriniz.");
        System.out.println("1. Sayi");
        int sayi1 = scanner.nextInt();
        System.out.println("2. Sayi");
        int sayi2 = scanner.nextInt();

        int n = Math.min(sayi1,sayi2);
        int ebob = 1;
        for (int i = 1; i <= n ; i++) {

            if ((sayi1 % i == 0) && (sayi2 %  i == 0 ) ){
                ebob = i;
            }
        }
        int ekok = (sayi1*sayi2)/ebob;

        System.out.println(ebob);
        System.out.println(ekok);




    }
}
