package day33_Adam_Asmaca;

import java.util.Random;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Kelime listesi
        String[] kelimeler = {"java", "programlama", "bilgisayar", "adamasmaca", "oynayalim"};

        // Rastgele kelime seçimi
        String secilenKelime = kelimeler[random.nextInt(kelimeler.length)];

        int hak = 6; // Toplam tahmin hakkı
        String tahminEdilenKelime = "";
        for (int i = 0; i < secilenKelime.length(); i++) {
            tahminEdilenKelime += "_"; // Seçilen kelimenin harflerini çizgi ile doldur
        }

        System.out.println("Adam Asmaca Oyunu\n");

        while (hak > 0) {
            System.out.println("Tahmin edilen kelime: " + tahminEdilenKelime);
            System.out.println("Kalan hak: " + hak);
            System.out.print("Bir harf tahmin edin: ");
            String tahmin = scanner.next();

            // Tahmin edilen harf kelime içinde var mı?
            boolean dogruTahmin = false;
            for (int i = 0; i < secilenKelime.length(); i++) {
                if (secilenKelime.charAt(i) == tahmin.charAt(0)) {
                    tahminEdilenKelime = tahminEdilenKelime.substring(0, i) + tahmin + tahminEdilenKelime.substring(i + 1);
                    dogruTahmin = true;
                }
            }

            if (!dogruTahmin) {
                hak--;
                System.out.println("Yanlış tahmin. Kalan hak: " + hak);
            }

            // Oyunun kazanılıp kazanılmadığını kontrol et
            if (tahminEdilenKelime.equals(secilenKelime)) {
                System.out.println("Tebrikler, kelimeyi doğru tahmin ettiniz: " + secilenKelime);
                break;
            }
        }

        if (hak == 0) {
            System.out.println("Üzgünüm, hakkınız tükendi. Doğru kelime: " + secilenKelime);
        }
    }

}
