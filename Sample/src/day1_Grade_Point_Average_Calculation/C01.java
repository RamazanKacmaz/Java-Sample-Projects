package day1_Grade_Point_Average_Calculation;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        System.out.println("Lütfen derslerin notlarini giriniz:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fizik Notunuzu giriniz :");
        int fiziknotu = scanner.nextInt();


        System.out.println("Matematik Notunuzu giriniz :");
        int matematikNotu = scanner.nextInt();


        System.out.println("Türkce Notunuzu giriniz :");
        int tukceNotu = scanner.nextInt();


        System.out.println("Kimya Notunuzu giriniz :");
        int kimyaNotu = scanner.nextInt();


        System.out.println("Muzik Notunuzu giriniz :");
        int muzikNotu = scanner.nextInt();


        System.out.println("Tarih Notunuzu giriniz :");
        int tarihNotu = scanner.nextInt();


        double genelOrtalama = (fiziknotu + matematikNotu + kimyaNotu + tukceNotu + muzikNotu + tarihNotu) / 6.0;

        System.out.println("Fizik Notunuz : " + fiziknotu);
        System.out.println("Matematik Notunuz : " + matematikNotu);
        System.out.println("Türkce Notunuz : " + tukceNotu);
        System.out.println("Kimya Notunuz : " + kimyaNotu);
        System.out.println("Muzik Notunuz : " + fiziknotu);
        System.out.println("Tarih Notunuz : " + fiziknotu);
        System.out.println("Ortalamaniz : " + genelOrtalama);



    }
}
