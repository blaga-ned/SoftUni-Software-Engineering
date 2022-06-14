package Lists.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String commandName = command[0];
            switch (commandName) {
                case "Contains":
                    int numToContain = Integer.parseInt(command[1]);
                    if (arrayList.contains(numToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (command[1].equals("even")) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) % 2 == 0) {
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();

                    } else if (command[1].equals("odd")) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) % 2 != 0) {
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "Get":
                    String sum = command[1];
                    int totalSum = 0;
                    if (command[1].equals("sum")) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            totalSum += arrayList.get(i);
                        }
                    }
                    System.out.println(totalSum);
                    break;

                case "Filter":
                    int number = Integer.parseInt(command[2]);
                    if (command[1].equals("<")){
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) < number){
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }else if (command[1].equals(">")){
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) > number){
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }else if (command[1].equals("<=")){
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) <= number){
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }else if (command[1].equals(">=")){
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i) >= number){
                                System.out.print(arrayList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            input = scanner.nextLine();

        }

    }
}
