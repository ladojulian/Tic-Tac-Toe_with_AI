import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var word = scanner.nextLine();
        var subWord = scanner.nextLine();

        var count = 0;
        while (word.contains(subWord)) {
            word = word.substring(word.indexOf(subWord) + subWord.length());
            count++;
        }
        System.out.println(count);
    }
}