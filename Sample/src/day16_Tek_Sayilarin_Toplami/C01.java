package day16_Tek_Sayilarin_Toplami;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int total=0;

        do {
            System.out.println("Sayi gir");
            sayi = scanner.nextInt();
            if (sayi % 2 == 1){
                total+= sayi;
            }

        }while (sayi>0);
        System.out.println(total);

       /* while (true) {
            System.out.println("Sayi gir");
            sayi = scanner.nextInt();

            if (sayi < 0) {
                break;
            }
            if (sayi % 2 == 1){
                total+= sayi;
            }

        }

        System.out.println(total);*/


    }
}

