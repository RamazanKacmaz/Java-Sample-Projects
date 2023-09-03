package day2_Rate_Amount_Calculation;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tutari giriniz:");

        int tutar = scanner.nextInt();
        int kdv= 0;

        if (tutar <= 500){
            kdv = 18;
        }else {
            kdv= 8;
        }

        int kvdtutar = (tutar*kdv)/100;

        int kvltutar = tutar+kvdtutar;

        System.out.println("Girilen tutar = " + tutar);
        System.out.println("Kdv orani % = " + kdv);
        System.out.println("Kdv Tutari = " + kvdtutar);
        System.out.println("Kdv'li toplam tutar = " + kvltutar);

    }
}
