import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var n = scanner.nextInt();
        var k = scanner.nextInt();

        var randomArray = new int[b + 1];
        for (var i = a; i <= b; i++) {
            Random rand = new Random(i);
            var max = 0;
            for (var j = 0; j < n; j++) {
                var ranDom = rand.nextInt(k);
                if (ranDom > max) {
                    max = ranDom;
                    randomArray[i] = max;
                }
            }
        }

        var min = Integer.MAX_VALUE;
        var minMaxSeed = 0;
        for (var y = a; y <= b; y++) {
            if (randomArray[y] < min) {
                min = randomArray[y];
                minMaxSeed = y;
            }
        }

        System.out.println(minMaxSeed);
        System.out.println(min);
    }
}