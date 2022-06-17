package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] commandData = input.split("\\|");
            String commandName = commandData[0];

            switch (commandName) {
                case "Move":
                    int numLetters = Integer.parseInt(commandData[1]);
                    StringBuilder sb = new StringBuilder(text);
                    for (int i = 0; i < numLetters; i++) {
                        sb.append(sb.charAt(0));
                        sb.deleteCharAt(0);
                    }
                    text = sb.toString();
                    break;

                case "Insert":
                    int numToInsert = Integer.parseInt(commandData[1]);
                    String letterToInsert = commandData[2];
                    StringBuilder builder = new StringBuilder(text);
                     builder.insert(numToInsert, letterToInsert);
                     text = builder.toString();
                    break;

                case "ChangeAll":
                    String substring = commandData[1];
                    String replacement = commandData[2];
                    text = text.replace(substring, replacement);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", text);
    }
}
