package day6_daire_cevre_alan_hesaplama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hesaplamak istdiginz dairenin yaricapini giriniz");
        double yariCap = scanner.nextDouble();
        double alan = 3.14 * yariCap*yariCap;
        double cevre = 2*3.14*yariCap;
        System.out.println("Dairenin yari capi :  " + yariCap + "\n"+
                "Dairenin alani  :  " + alan + "\n"+
                "Dairenin cevresi :  " + cevre + "\n");
    }
}
