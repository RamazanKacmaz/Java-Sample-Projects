package day36_Dizide_Tekrar_eden_sayilar;

public class C01 {
    public static void main(String[] args) {

        int[] dizi = {4, 2, 7, 8, 4, 1, 2, 9, 7, 5, 8};

        System.out.println("Dizideki tekrar eden sayılar:");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.println(dizi[i]);
                    break;
                }
            }
        }
    }
}
