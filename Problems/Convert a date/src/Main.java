import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var date = new Scanner(System.in).nextLine();

        System.out.println(
                date.substring(5, 7) + "/" +
                        date.substring(8) + "/" +
                        date.substring(0, 4));
    }
}