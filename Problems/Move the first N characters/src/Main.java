import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var s = scanner.next();
        var n = scanner.nextInt();

        if (s.length() < n) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(n) + s.substring(0, n));
        }
    }
}