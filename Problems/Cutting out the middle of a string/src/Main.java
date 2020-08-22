import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var str = new Scanner(System.in).nextLine();

        if (str.length() % 2 == 0) {
            System.out.print(str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1));
        } else {
            System.out.print(str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1));
        }
    }
}