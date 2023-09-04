package day39_Siralama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine().toLowerCase(); // Cümleyi küçük harflere çeviriyoruz
        System.out.print("Frekansını bulmak istediğiniz harfi girin: ");
        char hedefHarf = scanner.next().toLowerCase().charAt(0); // Aranacak harfi küçük harf olarak alıyoruz

        int frekans = harfinFrekansiniBul(cumle, hedefHarf);

        System.out.println("Cümledeki '" + hedefHarf + "' harfi " + frekans + " kez geçiyor.");
    }

    public static int harfinFrekansiniBul(String cumle, char harf) {
        int frekans = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                frekans++;
            }
        }

        return frekans;
    }
}
