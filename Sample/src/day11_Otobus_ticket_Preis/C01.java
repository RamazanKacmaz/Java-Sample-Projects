package day11_Otobus_ticket_Preis;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gideceginiz mesafeyi (km) olarak giriniz");
        int mesafeKM = scanner.nextInt();

        System.out.println("Lütfen yasinizi giriniz..");
        int yas = scanner.nextInt();

        System.out.println("Lütfen yolculuk tipini giriniz");
        System.out.println("Tek gidis icin  1 giriniz , gidis donus icin 2 giriniz");
        int yolculuktipi = scanner.nextInt();

        double mesafeUcret = 0.10;

        double toplamtutar = mesafeKM*mesafeUcret;

        if (mesafeKM < 0 && yas < 0 && yolculuktipi != 1 && yolculuktipi != 2){
            System.out.println("Hatali veri girdiniz..");
        } else if (yas<12) {
            System.out.println("Toplam tutar : " + toplamtutar + " TL" + " %50 indirim aldiniz " + (toplamtutar/2) + " TL" + "Odenecek tutar : " + (toplamtutar-(toplamtutar/2)));
        } else if (yas>12 && yas < 24) {
            System.out.println("Toplam tutar : " + toplamtutar + " TL" + " %10 indirim aldiniz " + (((toplamtutar*10)/100) )+ " TL" + " Odenecek tutar : " + (toplamtutar-((toplamtutar*10)/100)) + " TL");
        } else if (yas>65) {
            System.out.println("Toplam tutar : " + toplamtutar + " TL" + " %30 indirim aldiniz " + (((toplamtutar*30)/100) ) + "TL");
        } else if (yolculuktipi == 2) {
            System.out.println("Toplam tutar : " + toplamtutar +" TL" + " %20 indirim aldiniz " + (((toplamtutar*20)/100) )+ " TL");
        }

    }
}
