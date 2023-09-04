package day32_Fibonacci;

public class C01 {
    public static void main(String[] args) {

        int n = 10; // Hesaplanacak Fibonacci serisi uzunluğu
        System.out.print("Fibonacci Serisi (" + n + " eleman): ");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


}
