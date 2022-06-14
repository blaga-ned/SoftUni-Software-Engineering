package Methods.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = isValidLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidPasswordContent = isValidContent(password);
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidNumDigits = isValidCountDigits(password);
        if (!isValidNumDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidPasswordContent && isValidNumDigits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        return count >= 2;
    }
}

