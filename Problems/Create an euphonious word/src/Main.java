import java.util.*;

public class Main {
    public static void main(String[] args) {
        var word = new Scanner(System.in).nextLine().toCharArray();

        final var vowels = "aeiouy";
        for (var i = 0; i < word.length; i++) {
            if (vowels.contains(Character.toString(word[i]))) {
                word[i] = 'V';
            } else {
                word[i] = 'C';
            }
        }

        var count = 0;
        var row = 0;
        var isVowel = false;
        for (char c : word) {
            if (c == 'C') {
                if (isVowel) {
                    row = 1;
                    isVowel = !isVowel;
                } else {
                    row++;
                }
            } else {
                if (!isVowel) {
                    row = 1;
                    isVowel = !isVowel;
                } else {
                    row++;
                }
            }

            if (row == 3) {
                count++;
                row-=2;
            }
        }
        System.out.println(count);
    }
}