import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        var random = new Random(a + b);

        var sum = 0;
        for (var i = 0; i < n; i++) {
            sum += random.nextInt(b - a + 1) + a;
        }

        System.out.println(sum);
    }
}