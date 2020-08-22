import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var url = scanner.nextLine();

        var parameters = url.split("\\?")[1].split("&");

        var password = "";
        for (var parameter : parameters) {
            var keyValue = parameter.split("=");

            if (keyValue.length == 1) {
                System.out.println(keyValue[0] + " : not found");
            } else {
                System.out.println(keyValue[0] + " : " + keyValue[1]);
            }

            if (keyValue[0].equals("pass")) {
                password = keyValue[1];
            }
        }

        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }
    }
}