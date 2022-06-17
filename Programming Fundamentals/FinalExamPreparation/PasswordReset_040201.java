package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset_040201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            String commandName = command[0];
            switch (commandName) {
                case "TakeOdd":
                    for (int i = 0; i < text.length(); i++) {
                        char currentSymbol = text.charAt(i);
                        if (i % 2 != 0) {
                            sb.append(currentSymbol);
                        }
                    }
                    text = sb.toString();
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    String textToCut = text.substring(index, index+length);
                    text = text.replaceFirst(textToCut, "");
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring = command[1];
                    String substitute = command[2];
                    if (text.contains(substring)) {
                        text = text.replaceAll(substring, substitute);
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + text);
    }
}
