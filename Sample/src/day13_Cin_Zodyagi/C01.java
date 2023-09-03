package day13_Cin_Zodyagi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz");
        int dogumYili = scanner.nextInt();
        int result = dogumYili % 12;

       /* if (dogumYili % 12==0){
            System.out.println("Maymun");
        } else if (dogumYili%12==1) {
            System.out.println("Horoz");
        } else if (dogumYili % 12 == 2) {
            System.out.println("Kopek");
        } else if (dogumYili % 12 == 3) {
            System.out.println("Domuz");
        } else if (dogumYili % 12 == 4) {
            System.out.println("Fare");
        } else if (dogumYili % 12 == 5) {
            System.out.println("Öküz");
        } else if (dogumYili % 12 == 6) {
            System.out.println("Kaplan");
        } else if (dogumYili % 12 == 7) {
            System.out.println("Tavşan");
        } else if (dogumYili % 12 == 8) {
            System.out.println("Ejderha");
        } else if (dogumYili % 12 == 9) {
            System.out.println("Yılan");
        } else if (dogumYili % 12 == 10) {
            System.out.println("At");
        } else if (dogumYili % 12 == 11) {
            System.out.println("Koyun");
        }*/

        String  msg  = "Cin Zodyagi Burcunuz : ";

        switch (result){
            case 0:
                System.out.println(msg + " Maymun");
                break;
            case 1:
                System.out.println(msg+ " Horoz");
                break;
            case 2:
                System.out.println(msg + " Kopek");
                break;
            case 3:
                System.out.println(msg + " Domuz");
                break;
            case 4:
                System.out.println(msg + " Fare");
                break;
            case 5:
                System.out.println(msg + " Öküz");
                break;
            case 6:
                System.out.println(msg + " Kaplan");
                break;
            case 7:
                System.out.println(msg + " Tavşan");
                break;
            case 8:
                System.out.println(msg + " Ejderha");
                break;
            case 9:
                System.out.println(msg + " Yılan");
                break;
            case 10:
                System.out.println(msg + " At");
                break;
            case 11:
                System.out.println(msg + " Koyun");
                break;
            default:
                System.out.println("Hatali giris yaptiniz...");

        }

    }
}
