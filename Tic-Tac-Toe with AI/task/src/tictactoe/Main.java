package tictactoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final int length = 3;
    private static final char[][] matrix = new char[length][length];

    private static int numberOfXs = 0;
    private static int numberOfOs = 0;

    private static String userX;
    private static String userO;

    private static boolean isPlayingX;

    public static void main(String[] args) {
        /*System.out.print("Enter cells: ");

        var scanner = new Scanner(System.in);
        final var cells = scanner.nextLine().toCharArray();

        for (var i = 0; i < length; i++) {
            Arrays.fill(matrix[i], '_');
            for (var j = 0; j < length; j++) {
                matrix[i][j] = cells[i * length + j];
                switch (matrix[i][j]) {
                    case 'X':
                        numberOfXs++;
                        break;
                    case 'O':
                        numberOfOs++;
                }
            }
        }*/

        var wrongCommand = true;
        do {
            System.out.print("Input command: ");
            var command = scanner.nextLine().trim().split(" ");
            try {
                switch (command[0]) {
                    case "start":
                        userX = readCommand(command[1]);
                        userO = readCommand(command[2]);

                        if (userX != null && userO != null) {
                            numberOfOs = numberOfXs = 0;
                            runGame();
                        } else {
                            System.out.println("Bad parameters!");
                        }
                        break;
                    case "exit":
                        wrongCommand = false;
                        break;
                    default:
                        System.out.println("Bad parameters!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Bad parameters!");
            }
        } while (wrongCommand);
    }

    private static void runGame() {
        for (var i = 0; i < length; i++) {
            Arrays.fill(matrix[i], '_');
        }

        printMatrix();

        isPlayingX = true;
        var isPlaying = true;
        do {
            var wrongCoordinate = true;
            var currentUser = isPlayingX ? userX : userO;

            if (currentUser.equals("user")) {
                do {
                    System.out.print("Enter the coordinates: ");

                    try {
                        var coordinate = scanner.nextLine().trim().split(" ");
                        var x = Integer.parseInt(coordinate[0]);
                        var y = Integer.parseInt(coordinate[1]);

                        wrongCoordinate = validateCoordinate(x, y);
                    } catch (NumberFormatException e) {
                        System.out.println("You should enter numbers!");
                    }
                } while (wrongCoordinate);
            } else {
                switch (currentUser) {
                    case "easy":
                        moveRandom();
                        System.out.println("Making move level \"easy\"");
                        break;
                    case "medium":
                        moveMediumlevel();
                        System.out.println("Making move level \"medium\"");
                        break;
                    case "hard":
                        moveHardlevel();
                        System.out.println("Making move level \"hard\"");
                }
            }

            printMatrix();
            isPlaying = printResult();

            isPlayingX = !isPlayingX;
        } while (isPlaying);
    }

    private static String readCommand(String command) {
        switch (command) {
            case "easy":
            case "medium":
            case "hard":
            case "user":
                return command;
        }
        return null;
    }

    private static void moveMediumlevel() {
        var diagonalLeft = 0;
        var diagonalRight = 0;
        for (var i = 0; i < matrix.length; i++) {
            var horizontal = 0;
            var vertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                horizontal += matrix[i][j];
                vertical += matrix[j][i];

                if (i == j) {
                    diagonalLeft += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    diagonalRight += matrix[i][j];
                }
            }

            if (calculateWin(horizontal)) {
                printHorizontal(i);
                return;
            }

            if (calculateWin(vertical)) {
                printVertical(i);
                return;
            }
        }

        if (calculateWin(diagonalLeft)) {
            printDiagonalLeft();
            return;
        }

        if (calculateWin(diagonalRight)) {
            printDiagonalRight();
            return;
        }

        diagonalLeft = 0;
        diagonalRight = 0;
        for (var i = 0; i < matrix.length; i++) {
            var horizontal = 0;
            var vertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                horizontal += matrix[i][j];
                vertical += matrix[j][i];

                if (i == j) {
                    diagonalLeft += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    diagonalRight += matrix[i][j];
                }
            }

            if (calculateLoss(horizontal)) {
                printHorizontal(i);
                return;
            }

            if (calculateLoss(vertical)) {
                printVertical(i);
                return;
            }
        }

        if (calculateLoss(diagonalLeft)) {
            printDiagonalLeft();
            return;
        }

        if (calculateLoss(diagonalRight)) {
            printDiagonalRight();
            return;
        }

        moveRandom();
    }

    private static void moveHardlevel() {
        var diagonalLeft = 0;
        var diagonalRight = 0;
        for (var i = 0; i < matrix.length; i++) {
            var horizontal = 0;
            var vertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                horizontal += matrix[i][j];
                vertical += matrix[j][i];

                if (i == j) {
                    diagonalLeft += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    diagonalRight += matrix[i][j];
                }
            }

            if (calculateWin(horizontal)) {
                printHorizontal(i);
                return;
            }

            if (calculateWin(vertical)) {
                printVertical(i);
                return;
            }
        }

        if (calculateWin(diagonalLeft)) {
            printDiagonalLeft();
            return;
        }

        if (calculateWin(diagonalRight)) {
            printDiagonalRight();
            return;
        }

        diagonalLeft = 0;
        diagonalRight = 0;
        for (var i = 0; i < matrix.length; i++) {
            var horizontal = 0;
            var vertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                horizontal += matrix[i][j];
                vertical += matrix[j][i];

                if (i == j) {
                    diagonalLeft += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    diagonalRight += matrix[i][j];
                }
            }

            if (calculateLoss(horizontal)) {
                printHorizontal(i);
                return;
            }

            if (calculateLoss(vertical)) {
                printVertical(i);
                return;
            }
        }

        if (calculateLoss(diagonalLeft)) {
            printDiagonalLeft();
            return;
        }

        if (calculateLoss(diagonalRight)) {
            printDiagonalRight();
            return;
        }

        moveRandom();
    }

    private static boolean calculateWin(int sum) {
        var symbol = isPlayingX ? 'X' : 'O';
        return (sum - '_') % (2 * symbol) == 0;
    }

    private static boolean calculateLoss(int sum) {
        var symbol = isPlayingX ? 'O' : 'X';
        return (sum - '_') % (2 * symbol) == 0;
    }

    private static void printHorizontal(int index) {
        for (var j = 0; j < matrix.length; j++) {
            if (matrix[index][j] == '_') {
                matrix[index][j] = getNextSymbol();
            }
        }
    }

    private static void printVertical(int index) {
        for (var j = 0; j < matrix.length; j++) {
            if (matrix[j][index] == '_') {
                matrix[j][index] = getNextSymbol();
            }
        }
    }

    private static void printDiagonalLeft() {
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] == '_') {
                    matrix[i][j] = getNextSymbol();
                }
            }
        }
    }

    private static void printDiagonalRight() {
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1 && matrix[i][j] == '_') {
                    matrix[i][j] = getNextSymbol();
                }
            }
        }
    }

    private static void moveRandom() {
        var wrongCoordinate = true;
        var random = new Random();
        do {
            var x = random.nextInt(matrix.length);
            var y = random.nextInt(matrix.length);

            if (matrix[y][x] == '_') {
                matrix[y][x] = getNextSymbol();
                wrongCoordinate = false;
            }
        } while (wrongCoordinate);
    }

    private static boolean printResult() {
        var diagonalLeft = 0;
        var diagonalRight = 0;
        for (var i = 0; i < matrix.length; i++) {
            var horizontal = 0;
            var vertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                horizontal += matrix[i][j];
                vertical += matrix[j][i];

                if (i == j) {
                    diagonalLeft += matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    diagonalRight += matrix[i][j];
                }
            }

            if (calculateRow(horizontal) || calculateRow(vertical)) {
                return false;
            }
        }

        if (calculateRow(diagonalLeft) || calculateRow(diagonalRight)) {
            return false;
        }

        if (numberOfOs + numberOfXs == matrix.length * matrix.length) {
            System.out.println("Draw");
            return false;
        }
        //System.out.println("Game not finished");
        return true;
    }

    private static boolean calculateRow(int sum) {
        if (sum % 'X' == 0) {
            System.out.println("X wins");
            return true;
        }
        if (sum % 'O' == 0) {
            System.out.println("O wins");
            return true;
        }
        return false;
    }

    private static boolean validateCoordinate(int x, int y) {
        if (x > length || x < 1 || y > length || y < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return true;
        }

        x--;
        y = Math.abs(y - length);

        if (matrix[y][x] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            return true;
        } else {
            matrix[y][x] = getNextSymbol();
        }

        return false;
    }

    private static char getNextSymbol() {
        if (numberOfOs == numberOfXs) {
            numberOfXs++;
            return 'X';
        }
        numberOfOs++;
        return 'O';
    }

    private static void printMatrix() {
        System.out.println("---------");
        for (char[] line : matrix) {
            System.out.print("| ");
            for (char cell : line) {
                System.out.print(cell + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
