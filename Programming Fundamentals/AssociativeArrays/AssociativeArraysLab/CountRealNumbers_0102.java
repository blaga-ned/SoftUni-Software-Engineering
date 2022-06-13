package AssociativeArrays.AssociativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countNumbersMap = new TreeMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            double currentNum = numbersList.get(i);

            if (countNumbersMap.containsKey(currentNum)){
                countNumbersMap.put(currentNum, countNumbersMap.get(currentNum) + 1);
            }else{
                countNumbersMap.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}

