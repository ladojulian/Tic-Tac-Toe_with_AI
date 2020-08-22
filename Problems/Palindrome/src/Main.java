import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var word = new Scanner(System.in).nextLine().toCharArray();

        for (var i = 0; i < word.length - i; i++) {
            if (word[i] != word[word.length - i - 1]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}