package day5_Manav_Sepet_Tutari_Hesaplama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Salatalıkf = 3.14;
        double Elmaf = 4.11;
        double Kabakf = 2.22;
        double Domatesf = 0.95;
        double Patlıcanf = 7.00;

        System.out.println("Salatalık : 3,14 TL\n" +
                "Elma : 4,11 TL\n" +
                "Kabak : 2,22 TL\n" +
                "Domates: 0,95 TL\n" +
                "Patlıcan : 7,00 TL");

        System.out.println("Ne kadar Salatalik alacaksiniz giriniz : ");
        int salatalik = scanner.nextInt();


        System.out.println("Ne kadar Elma alacaksiniz giriniz : ");
        int elma = scanner.nextInt();

        System.out.println("Ne kadar kabak alacaksiniz giriniz : ");
        int kabak = scanner.nextInt();

        System.out.println("Ne kadar domates alacaksiniz giriniz : ");
        int domates = scanner.nextInt();

        System.out.println("Ne kadar patlican alacaksiniz giriniz : ");
        int patlican = scanner.nextInt();

        double toplamtutar = (Salatalıkf*salatalik)+(Elmaf*elma)+(Kabakf*kabak)+(Domatesf*domates)+(Patlıcanf*patlican);

        DecimalFormat df = new DecimalFormat("0.00");
        String sayi = df.format(toplamtutar);

        System.out.println("Salatalık : 3,14 TL" + " istediginiz kg :  " + salatalik + "\n"+
                "Elma : 4,11 TL" +" istediginiz kg : " + elma +"\n"+
                "Kabak : 2,22 TL" +" istediginiz kg :  " + kabak +"\n"+
                "Domates: 0,95 TL" +" istediginiz kg  : " + domates +"\n"+
                "Patlıcan : 7,00 TL" +" istediginiz kg  : " + patlican +"\n"+
                "Toplam Fiat = " + sayi + " TL ");

    }
}
