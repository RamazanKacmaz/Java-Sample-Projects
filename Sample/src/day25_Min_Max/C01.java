package day25_Min_Max;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksniniz...");
        int n = scanner.nextInt();

        int min = 0;
        int max = 0;
        int nummer;

        for (int i = 1; i <= n ; i++) {
            System.out.println(i + " . sayi giriniz");
            nummer = scanner.nextInt();
            if (nummer < min || min == 0){
                min =nummer;
            }
            if (nummer> max){
                max = nummer;
            }
        }
        System.out.println("Girilen sayilarin en kucugu "+ min);
        System.out.println("Girilen sayilarin en buyugu "+max);




    }
}
