package day12_Artik_Yil_Hesaplama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen bir yil giriniz");
        int girilenYil = scanner.nextInt();

        if (girilenYil% 4 == 0 && girilenYil % 100 != 0){
            System.out.println("Girilen yil " + girilenYil + " Artik yildir");
        } else if (girilenYil > 100 && girilenYil % 400 == 0) {
            System.out.println("Girilen yil " + girilenYil + " Artik yildir");
        } else{
            System.out.println("Girilen yil " + girilenYil + " Artik yildir degildir");
        }
    }
}
