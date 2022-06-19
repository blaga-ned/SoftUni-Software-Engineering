package StacksAndQueues.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommand = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 1; i <= countCommand; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int commandNumber = Integer.parseInt(input[0]);

            switch (commandNumber) {
                case 1:
                    textStack.push(currentText.toString());
                    String stringToAppend = input[1];
                    currentText.append(stringToAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsToDelete = Integer.parseInt(input[1]);
                    int startIndexToDelete = currentText.length() - countElementsToDelete;
                    currentText.delete(startIndexToDelete, startIndexToDelete + countElementsToDelete);
                    break;
                case 3:
                    int index = Integer.parseInt(input[1]);
                    System.out.println(currentText.charAt(index - 1));
                    break;
                case 4:
                    if (!textStack.isEmpty()){
                        currentText = new StringBuilder(textStack.pop());
                        break;
                    }
            }

        }

    }
}
