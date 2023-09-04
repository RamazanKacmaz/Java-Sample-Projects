package day35_Min_Max;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Kullanıcıdan elemanları girmesini iste
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını girin:");

        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        // Minimum ve maksimum değerleri bul
        int min = dizi[0]; // Başlangıçta ilk elemanı minimum olarak kabul ediyoruz
        int max = dizi[0]; // Başlangıçta ilk elemanı maksimum olarak kabul ediyoruz

        for (int i = 1; i < boyut; i++) {
            if (dizi[i] < min) {
                min = dizi[i]; // Yeni minimum değeri güncelle
            }
            if (dizi[i] > max) {
                max = dizi[i]; // Yeni maksimum değeri güncelle
            }
        }

        // Minimum ve maksimum değerleri ekrana yazdır
        System.out.println("Dizinin minimum değeri: " + min);
        System.out.println("Dizinin maksimum değeri: " + max);

    }
}
