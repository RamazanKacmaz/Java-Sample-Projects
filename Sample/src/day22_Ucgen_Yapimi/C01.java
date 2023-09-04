package day22_Ucgen_Yapimi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir deger giriniz;");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            for (int j = 1; j <(sayi-i) ; j++) {
                System.out.println(" ");
            }

            for (int k = 1; k <= (2* i)-1 ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
