package day28_Asal_Sayi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir  adet sayi gireceksniniz...");
        int nummer = scanner.nextInt();

       /* if (nummer%2 != 0 && nummer%3 != 0 ){
            System.out.println(nummer + " Sayi asaldir.");
        }else {
            System.out.println(nummer+ " Sayi asal degildir");
        }*/

        boolean flag = true;


        for (int i = 2; i < nummer ; i++) {
            System.out.print(i + " ");
            if (nummer % i ==0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(nummer + " Sayi asaldir.");
        }else {
            System.out.println(nummer+ " Sayi asal degildir");
        }

    }
}
