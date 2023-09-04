package day27_Ters_Ucgen;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac satir olsun");
        int satir = scanner.nextInt();
        System.out.println("Kac sutun olsun");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir  ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(i + "," + j +" ");
            }
            System.out.println("");
        }


    }
}
