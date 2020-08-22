import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var array = new Scanner(System.in)
                .nextLine()
                .toCharArray();

        var ch = array[0];
        for (var i = 1; i < array.length; i++) {
            if (ch + 1 != array[i]) {
                System.out.println("false");
                return;
            }
            ch++;
        }
        System.out.println("true");
    }
}