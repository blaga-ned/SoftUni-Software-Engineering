package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] command = input.split("\\s+");
            String commandName = command[0];
            switch (commandName){
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexToInsert = Integer.parseInt(command[2]);
                    if (indexToInsert >= 0 && indexToInsert <= numbers.size() - 1){
                        numbers.add(indexToInsert, numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (indexToRemove >= 0 && indexToRemove <= numbers.size() - 1){
                        numbers.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String leftOrRight = command[1];
                    int countMoves = Integer.parseInt(command[2]);
                    if (leftOrRight.equals("left")){
                        for (int i = 0; i < countMoves; i++) {
                            int firstElement = numbers.get(0);
                            numbers.add(firstElement);
                            numbers.remove(0);
                        }
                    }else{
                        for (int i = 0; i < countMoves; i++) {
                            int lastElement = numbers.get(numbers.size()-1);
                            numbers.add(0, lastElement);
                            numbers.remove(numbers.size()-1);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
