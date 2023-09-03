package day20_Harmonik_Seri_Hesaplama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N degeri girin..");
        double n = scanner.nextDouble();
        double result = 0;

        for (double i = 1; i <= n ; i++) {
            result = result + (1/i);
        }
        System.out.println(result);

    }
}
