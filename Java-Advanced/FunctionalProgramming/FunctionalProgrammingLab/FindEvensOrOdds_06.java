package FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        int startNum = Integer.parseInt(numbers[0]);
        int endNum = Integer.parseInt(numbers[1]);
        String oddOrEven = scanner.nextLine();

        List<Integer> nums = new ArrayList<>();
        for (int i = startNum; i <= endNum; i++) {
            nums.add(i);
        }
        Predicate<Integer> predicateEven = e -> e % 2 == 0;
        Predicate<Integer> predicateOdd = e -> e % 2 != 0;
        List<Integer> newNums = new ArrayList<>();
        Consumer<Integer> print = e -> System.out.print(e + " ") ;
        if (oddOrEven.equals("odd")) {
            newNums = nums.stream()
                    .filter(predicateOdd)
                    .collect(Collectors.toList());
        } else if (oddOrEven.equals("even")) {
            newNums = nums.stream()
                    .filter(predicateEven)
                    .collect(Collectors.toList());

        }
        newNums.forEach(print);

    }
}
