package day7_Taksimetre;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
       // Taksimetre

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac km gideceginizi giriniz...");
        double gidilecekKm = scanner.nextDouble();

        double kmPreis = 2.20;
        double kisamesfePreis = 20;
        double acilisUcreti = 10;

        if ((gidilecekKm*kmPreis) <= 20){
            System.out.println("Odenecek tutar (Kisa Mesafe) = " +(int) kisamesfePreis + " TL");
        }else {
            System.out.println("Odenecek tutar (Uzun Mesafe) = " +(int) (acilisUcreti+(gidilecekKm*kmPreis)) + " TL");
        }



    }
}
