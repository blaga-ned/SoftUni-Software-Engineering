package AssociativeArrays.AssociativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1)).limit(3)
                .collect(Collectors.toList());
        for (int i : numberList){
            System.out.print(i + " ");
        }


    }
}
