package day08_Hesap_Makinasi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz...");
        System.out.println("1. sayi");
        int say1 = scanner.nextInt();
        System.out.println("2. sayi");
        int sayi2 = scanner.nextInt();

        /*int toplama = (say1+sayi2);
        int cikarma = (say1-sayi2);
        int carpma = (say1*sayi2);
        int bolme = (say1/sayi2);

        System.out.println("Girdiginiz sayilar : " + "Sayi 1 : " + say1 + " Sayi 2 : "+ sayi2 + "\n"+
                "Toplama deger = " + toplama + "\n"+
                "Cikarma deger = " + cikarma + "\n"+
                "Carpma deger = " + carpma + "\n"+
                "Bolme deger = " + bolme + "\n");

        System.out.println("Islemi seciniz");
        System.out.println("1 - Toplama");
        System.out.println("2 - Cikarma");
        System.out.println("3 - Carpma");
        System.out.println("4 - Bolme");
        int select = scanner.nextInt();

        if (select == 1){
            System.out.println("Toplama deger :" +(say1+sayi2));
        } else if (select == 2) {
            System.out.println("Cikarma deger :" +(say1-sayi2));
        } else if (select==3) {
            System.out.println("Carpma deger :" +(say1*sayi2));
        } else if (select==4) {
            System.out.println("Bolme deger :" +(say1/sayi2));
        }*/


        System.out.println("Islemi seciniz");
        System.out.println("1 - Toplama");
        System.out.println("2 - Cikarma");
        System.out.println("3 - Carpma");
        System.out.println("4 - Bolme");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama deger :" +(say1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma deger :" +(say1-sayi2));
                break;
            case 3:
                System.out.println("Carpma deger :" +(say1*sayi2));
                break;
            case 4:
                System.out.println("Bolme deger :" +(say1/sayi2));
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
        }


    }
}
