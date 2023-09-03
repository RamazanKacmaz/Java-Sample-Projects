package day14_Burc_Bulma;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum ayinizi giriniz");
        int dogumAyi = scanner.nextInt();
        System.out.println("Lutfen dogum gunu yaziniz");
        int dogumGun = scanner.nextInt();



        if (dogumAyi > 0 && dogumAyi < 13){

            if (dogumAyi == 3 || dogumAyi== 4 && dogumGun <= 20 ){
                System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
            } else if (dogumAyi == 4 || dogumAyi== 5 && dogumGun<=21) {
                System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
            } else if (dogumAyi == 5 || dogumAyi == 6 && dogumGun<=22) {
                System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
            } else if (dogumAyi == 6 || dogumAyi== 7 && dogumGun<=22) {
                System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
            } else if (dogumAyi == 7 || dogumAyi==8 && dogumGun<=22) {
                System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
            } else if (dogumAyi == 8 || dogumAyi==9 && dogumGun<=22) {
                System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
            } else if (dogumAyi == 9 || dogumAyi== 10 && dogumGun<=22) {
                System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
            } else if (dogumAyi == 10 || dogumAyi== 11 && dogumGun<=21) {
                System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
            } else if (dogumAyi == 11 || dogumAyi== 12 && dogumGun<=21) {
                System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
            } else if (dogumAyi == 12 || dogumAyi==1 && dogumGun<=21) {
                System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
            } else if (dogumAyi == 1 || dogumAyi==2 && dogumGun<=19) {
                System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
            } else if (dogumAyi == 2 || dogumAyi== 3 && dogumGun<=20) {
                System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
            }

        }else {
            System.out.println("Hatali tarih yazdiniz..");
        }

    }
}
