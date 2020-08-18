import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var partsToShip = 0;
        var partsToFix = 0;
        var partsToReject = 0;

        for (var i = scanner.nextInt(); i > 0; i--) {
            var part = scanner.nextInt();
            if (part == 0) {
                partsToShip++;
            } else if (part == 1) {
                partsToFix++;
            } else {
                partsToReject++;
            }
        }
        System.out.println(partsToShip + " " + partsToFix + " " + partsToReject);
    }
}