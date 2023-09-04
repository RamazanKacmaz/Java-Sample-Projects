package day29_Fibonacci_Serisi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int nummer = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        int n = nummer;

        System.out.print("Fibonacci Serisi (" + n + " eleman):\n ");


        for (int i = 3; i <= n; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }

    }
}

