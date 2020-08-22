import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        var builder = new StringBuilder();
        for (var string : strings) {
            builder.append(string);
        }

        for (var i = 0; i < 10; i++) {
            var hasDigit = builder.indexOf(String.valueOf(i));
            while (hasDigit != -1) {
                builder.deleteCharAt(hasDigit);
                hasDigit = builder.indexOf(String.valueOf(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}