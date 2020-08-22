import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var words = new Scanner(System.in).nextLine().toLowerCase();

        System.out.println(words.indexOf("the"));
    }
}