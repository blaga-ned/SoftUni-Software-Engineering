package AssociativeArrays.AssociativeArraysLab;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbers = new TreeMap<>();

        for (double num : nums) {
            if (!numbers.containsKey(num)) {
                numbers.put(num, 1);
            } else {
                int occurrences = numbers.get(num);
                occurrences++;
                numbers.put(num, occurrences);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}
