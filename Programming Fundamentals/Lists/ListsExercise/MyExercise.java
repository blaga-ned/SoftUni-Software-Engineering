package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int bombNumber = Integer.parseInt(elements[0]);
        int power = Integer.parseInt(elements[1]);
        int sum = 0;

        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) == bombNumber) {

                for (int j = 0; j < power; j++) {
                    if (i != listNumbers.size() - 1) {
                        listNumbers.remove(i + 1);
                    }
                    if (i - 1 >= 0) {
                        listNumbers.remove(i - 1);
                    }
                    i--;
                }
                listNumbers.remove(Integer.valueOf(bombNumber));
                i = -1;
            }
        }
        for (Integer listNumber : listNumbers) {
            sum += listNumber;
        }
        System.out.println(sum);

    }
}
