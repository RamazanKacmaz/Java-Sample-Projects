package day34_Dizideki_Elamanlarin_Ortalamasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin uznlugunu giriinz");
        int lang = scanner.nextInt();
        int [] list = new int[lang];

        System.out.println("Dizinin elamanlarini giriniz");

        for (int i = 0; i < lang ; i++) {
            list[i] = scanner.nextInt();
        }

        int toplam = 0;

        for (int i = 0; i < lang ; i++) {
            toplam += list[i];
        }

        double ortalama = (double) toplam/lang;

        System.out.println(ortalama);


    }
}
