package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z][a-z]+)!:(?<message>\\[[A-Za-z]{8,}\\])";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String command = matcher.group("command");
                String message = matcher.group("message");
                System.out.print(command + ":");
                for (int j = 0; j < message.length(); j++) {
                    System.out.print(" " + (int) message.charAt(j));
                }
                System.out.println();

            }else{
                System.out.println("The message in invalid");
            }

        }

    }
}
