package day10_Buyukten_Kucuge_Siralama;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 adet sayi giriniz");
        
        System.out.println("1.Sayi");
        int sayi1 = scanner.nextInt();
        
        System.out.println("2.Sayi");
        int sayi2 = scanner.nextInt();
        
        System.out.println("3.Sayi");
        int sayi3 = scanner.nextInt();
        
        if (sayi1 > sayi2 && sayi2 > sayi3){
          if (sayi2>sayi3){
              System.out.println("sayi1>sayi2>sayi3");
          }else {
              System.out.println("sayi1>sayi3>sayi2");
          }
        } else if (sayi2 > sayi1 && sayi2 > sayi3 ) {
            if (sayi1>sayi3){
                System.out.println("sayi2>sayi1>sayi3");
            }else {
                System.out.println("sayi2>sayi3>sayi1");
            }
        } else if (sayi3>sayi1 && sayi3>sayi2) {
            if (sayi1>sayi2){
            System.out.println("sayi3>sayi1>sayi2");
            }else {
                System.out.println("sayi3>sayi2>sayi1");
            }
        }


    }
}
