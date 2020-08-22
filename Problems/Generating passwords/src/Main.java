import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var n = scanner.nextInt();

        var symbol = false;
        while (a != 0) {
            System.out.print(symbol ? 'A' : 'B');
            a--;
            n--;
            symbol = !symbol;
        }

        while (b != 0) {
            System.out.print(symbol ? 'a' : 'b');
            b--;
            n--;
            symbol = !symbol;
        }

        while (c != 0) {
            System.out.print(symbol ? '1' : '2');
            c--;
            n--;
            symbol = !symbol;
        }

        while (n != 0) {
            System.out.print(symbol ? 'A' : 'B');
            n--;
            symbol = !symbol;
        }
    }
}