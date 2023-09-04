package day37_Siralama;

public class C01 {
    public static void main(String[] args) {
        int[] dizi = {5, 2, 9, 1, 5, 6};

        System.out.println("Dizinin sıralanmamış hali:");
        diziYazdir(dizi);

        diziSiralama(dizi);

        System.out.println("\nDizinin sıralanmış hali:");
        diziYazdir(dizi);
    }

    // Dizi elemanlarını küçükten büyüğe sıralama
    public static void diziSiralama(int[] dizi) {
        int n = dizi.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Elemanları değiştir
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }

    // Diziyi ekrana yazdırma
    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
}
