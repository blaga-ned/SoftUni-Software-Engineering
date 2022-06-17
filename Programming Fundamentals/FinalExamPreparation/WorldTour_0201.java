package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour_0201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder initialDestination = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add Stop":
                    int insertIndex = Integer.parseInt(commandParts[1]);
                    String textToInsert = commandParts[2];
                    if (insertIndex >= 0 && insertIndex < initialDestination.length()) {
                        initialDestination.insert(insertIndex, textToInsert);
                        System.out.println(initialDestination);
                    }
                    break;

                case "Remove Stop":
                    int beginIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if ((beginIndex >= 0 && beginIndex < initialDestination.length())
                            && (endIndex >= 0 && endIndex < initialDestination.length())) {
                        initialDestination.delete(beginIndex, endIndex + 1);

                    }
                    System.out.println(initialDestination);
                    break;

                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    String destinationAsString = initialDestination.toString();
                    destinationAsString = destinationAsString.replaceAll(oldString, newString);
                    initialDestination = new StringBuilder(destinationAsString);
                    System.out.println(initialDestination);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", initialDestination.toString());


    }
}
