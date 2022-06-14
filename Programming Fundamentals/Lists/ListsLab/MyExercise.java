package Lists.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();

        if (listOne.size() < listTwo.size()) {
            for (int i = 0; i < listOne.size(); i++) {
                newList.add(listOne.get(i));
                newList.add(listTwo.get(i));
            }
            for (int i = listOne.size(); i < listTwo.size(); i++) {
                newList.add(listTwo.get(i));
            }

        } else if (listTwo.size() < listOne.size()) {
            for (int i = 0; i < listTwo.size(); i++) {
                newList.add(listOne.get(i));
                newList.add(listTwo.get(i));
            }
            for (int i = listTwo.size(); i < listOne.size(); i++) {
                newList.add(listOne.get(i));
            }
        } else {
            for (int i = 0; i < listOne.size(); i++) {
                newList.add(listOne.get(i));
                newList.add(listTwo.get(i));
            }

        }
        for (Integer number : newList) {
            System.out.print(number + " ");
        }

    }
}
