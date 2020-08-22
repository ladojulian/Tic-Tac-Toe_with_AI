import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var str = new Scanner(System.in).nextLine().toCharArray();

        for (var ch : str) {
            System.out.print("" + ch + ch);
        }
    }
}