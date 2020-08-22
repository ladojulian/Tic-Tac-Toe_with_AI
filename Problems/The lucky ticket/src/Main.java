import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var ticketNumber = new Scanner(System.in).nextLine().toCharArray();

        var sumFirst = 0;
        var sumLast = 0;
        for (var i = 0; i < ticketNumber.length - 3; i++) {
            sumFirst += Character.getNumericValue(ticketNumber[i]);
            sumLast += Character.getNumericValue(ticketNumber[i + 3]);
        }

        if (sumFirst == sumLast) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}