package day4_Vücut_Kitle_Index_Hesaplama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu m cinsinden giriniz.");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        double vucutkitleendeks = kilo/(boy*boy);

        System.out.println("Boy : " + boy + "\n"+
                "Kilo : " + kilo + "\n"+
                "Vucut Kile Endeks : " + vucutkitleendeks);


        if (vucutkitleendeks>35){
            System.out.println("Aşırı Obez");
        } else if (vucutkitleendeks>30) {
            System.out.println("Obez");
        } else if (vucutkitleendeks>25) {
            System.out.println("Sisman");
        } else if (vucutkitleendeks> 18.5) {
            System.out.println("ideal");
        } else if (vucutkitleendeks<18) {
            System.out.println("zayif");
        }


    }
}
