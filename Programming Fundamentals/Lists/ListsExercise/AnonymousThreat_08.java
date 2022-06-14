package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesInput = scanner.nextLine();
        List<String> name = Arrays.stream(namesInput.split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            if (commandName.equals("merge")) {
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > name.size() - 1) {
                    endIndex = name.size() - 1;
                }
                boolean isStartIndexValid = isValidIndex(startIndex, name.size());
                boolean isEndIndexValid = isValidIndex(endIndex, name.size());
                if (isStartIndexValid && isEndIndexValid) {

                    StringBuilder resultMerge = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        resultMerge.append(name.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        name.remove(startIndex);
                    }
                    name.add(startIndex, resultMerge.toString());
                }

            } else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementForDivide = name.get(index);
                name.remove(index);
                int partSize = elementForDivide.length() / partitions;
                int begin = 0;
                for (int i = 1; i < partitions; i++) {
                    name.add(index, elementForDivide.substring(begin + partSize));
                    index++;
                    begin += partSize;
                }
                name.add(index, elementForDivide.substring(begin));
            }

            command = scanner.nextLine();

        }
        System.out.println(String.join(" ", name));
    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }

}
