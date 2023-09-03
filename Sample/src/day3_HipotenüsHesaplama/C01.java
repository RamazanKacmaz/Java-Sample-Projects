package day3_HipotenüsHesaplama;

import java.util.Map;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin iki kenarini giriniz:");

        System.out.println("1. Kenar :");
        int kenar1 = scanner.nextInt();

        System.out.println("2. Kenar :");
        int kenar2 = scanner.nextInt();

        double hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Kenar 1 : " + kenar1 + "\n" +
                "Kenar 2 : " + kenar2 + "\n"+
                "Hipotenus = " + (int)(hipotenus));

        int cevre = kenar1+kenar2+(int) hipotenus;
        System.out.println("Ucgenin cevresi : " + cevre);

        int alan = (kenar1*kenar2)/2;

        System.out.println("ucgenin Alani : " + alan);

    }
}
