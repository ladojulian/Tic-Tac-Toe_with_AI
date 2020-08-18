import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var start = scanner.nextInt();
        var end = scanner.nextInt();

        for (; start <= end; start++) {
            var output = new StringBuilder();
            if (start % 3 == 0) {
                output.append("Fizz");
            }
            if (start % 5 == 0) {
                output.append("Buzz");
            }

            System.out.println(output.toString().isEmpty() ? start : output.toString());
        }
    }
}