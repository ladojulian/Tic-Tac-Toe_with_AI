import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var k = scanner.nextInt();
        var n = scanner.nextInt();
        var m = scanner.nextDouble();

        var seed = k;
        for (; ; seed++) {
            var random = new Random(seed);

            var areLessOrEqual = true;
            for (var i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    areLessOrEqual = false;
                    break;
                }
            }

            if (areLessOrEqual) {
                break;
            }
        }

        System.out.println(seed);
    }
}