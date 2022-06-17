package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandData = input.split(" ");
            String commandName = commandData[0];
            switch (commandName) {
                case "Translate":
                    String letter = commandData[1];
                    String replacement = commandData[2];
                    text = text.replaceAll(letter, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String checkSubstring = commandData[1];
                    if (text.contains(checkSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String checkStart = commandData[1];
                    String[] array = text.split(" ");
                    boolean isTrue = false;
                    for (String s : array) {
                        if (s.equals(checkStart)) {
                            isTrue = true;
                            System.out.println("True");
                            break;
                        }
                    }
                    if (!isTrue) {
                        System.out.println("False");
                    }

                    break;
                case "Lowercase":
                    text = text.toLowerCase(Locale.ROOT);
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String findIndex = commandData[1];
                    int indexFind = text.lastIndexOf(findIndex);
                    System.out.println(indexFind);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    String textToRemove = text.substring(startIndex, endIndex);
                    text = text.replace(textToRemove, "");
                    System.out.println(text);
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
