package FinalExamPreparation;

import java.util.IllegalFormatCodePointException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class PasswordReset_0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandsParts = command.split("\\s+");
            String commandName = commandsParts[0];
            switch (commandName) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 0; i <= password.length() - 1; i++) {
                        if (i % 2 == 1) {
                            char currentSymbol = password.charAt(i);
                            newPassword.append(currentSymbol);
                        }
                    }
                    password = newPassword.toString();
                    System.out.println(password);
                    break;

                case "Cut":
                    int index = Integer.parseInt(commandsParts[1]);
                    int length = Integer.parseInt(commandsParts[2]);

                    String substringToRemove = password.substring(index, index+length);
                    password = password.replaceFirst(substringToRemove, "");
                    System.out.println(password);
                    break;

                case "Substitute":
                    String substring = commandsParts[1];
                    String substitute = commandsParts[2];
                    if (password.contains(substring)){
                        password = password.replaceAll(substring,substitute);
                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);

    }
}
