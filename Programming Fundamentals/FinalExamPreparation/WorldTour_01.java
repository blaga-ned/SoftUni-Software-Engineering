package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commandData = input.split(":");
            String commandName = commandData[0];

            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandData[1]);
                    String stringToAdd = commandData[2];
                    StringBuilder sb = new StringBuilder(destination);
                    if (isValidIndex(index, destination)) {
                        destination = sb.insert(index, stringToAdd).toString();
                    }
                    System.out.println(destination);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    StringBuilder builder = new StringBuilder(destination);
                    if ((startIndex >= 0 && startIndex < destination.length()) && (endIndex > 0 && endIndex < destination.length())){
                        destination = builder.delete(startIndex, endIndex+1).toString();
                    }
                    System.out.println(destination);
                    break;

                case "Switch":
                    String oldString = commandData[1];
                    String newString = commandData[2];
                    destination = destination.replace(oldString, newString);
                    System.out.println(destination);
                    break;

            }

            input = scanner.nextLine();

        }
        System.out.printf("Ready for world tour! Planned stops: %s", destination);

    }

    private static boolean isValidIndex(int index, String text) {
        if (!(index >= 0 && index < text.length())) {
            return false;
        }
        return true;
    }

}
