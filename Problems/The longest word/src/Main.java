import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var words = new Scanner(System.in)
                .nextLine()
                .split(" ");

        var longest = "";
        for (var word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }
}