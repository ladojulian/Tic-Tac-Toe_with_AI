import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var dna = new Scanner(System.in).next().toCharArray();

        var count = 1;
        var previousCharacter = dna[0];
        System.out.print(previousCharacter);
        for (var i = 1; i < dna.length; i++) {
            if (previousCharacter == dna[i]) {
                count++;
            } else {
                System.out.print("" + count + dna[i]);
                count = 1;
                previousCharacter = dna[i];
            }
        }
        System.out.print(count);
    }
}