package day9_Sicakliga_Göre_Etkinlik;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sicaklik degeri giriniz...");
        double sicaklik = scanner.nextDouble();

        if (sicaklik<5){
            System.out.println("Alplere KAYAK yapmaya gidebilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("TIYATRO'ya gidebilirsiniz");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Ailenizle MANGAL'a yapabilirsiniz");
        } else if (sicaklik >= 25) {
            System.out.println("Havuza YUZMEY'e gidebilirsiniz.");
        }
    }
}
