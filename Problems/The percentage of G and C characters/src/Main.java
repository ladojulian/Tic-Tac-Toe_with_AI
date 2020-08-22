import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var gcContent = new Scanner(System.in).nextLine()
                .toLowerCase()
                .toCharArray();

        var count = 0;
        for (var gc : gcContent) {
            if (gc == 'g' || gc == 'c') {
                count++;
            }
        }
        System.out.println((double) count / gcContent.length * 100);
    }
}