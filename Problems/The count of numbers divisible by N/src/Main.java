import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var n = scanner.nextInt();

        System.out.println((b - a) / n + 1);
    }
}