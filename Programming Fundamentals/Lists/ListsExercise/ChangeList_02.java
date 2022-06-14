package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int number = Integer.parseInt(commandParts[1]);

            if (commandName.equals("Delete")) {
                for (int i = 0; i < list.size(); i++) {
                    int currentNumber = list.get(i);
                    if (currentNumber == number) {
                        list.remove(Integer.valueOf(number));
                    }
                }
            } else if (commandName.equals("Insert")) {
                int index = Integer.parseInt(commandParts[2]);
                list.add(index, number);
            }
            command = scanner.nextLine();

        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
