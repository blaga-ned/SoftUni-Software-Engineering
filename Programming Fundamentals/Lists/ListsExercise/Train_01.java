package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandData = command.split(" ");
            if (commandData[0].equals("Add")) {
                int passengers = Integer.parseInt(commandData[1]);
                wagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        wagons.set(i, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
