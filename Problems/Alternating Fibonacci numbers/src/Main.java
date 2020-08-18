import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (n % 2 == 0 ? -1 : 1) * (Math.abs(fib(n - 1)) + Math.abs(fib(n - 2)));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}