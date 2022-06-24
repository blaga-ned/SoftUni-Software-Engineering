package FunctionalProgrammingLab;

import java.util.*;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenNumbers.add(numbers[i]);
            }
        }
        List<String> evenNumbersAsStrings = new ArrayList<>();
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenNumbersAsStrings.add(String.valueOf(evenNumbers.get(i)));
        }
        System.out.println(String.join(", ", evenNumbersAsStrings));
        Collections.sort(evenNumbers);
        System.out.println(String.join(", ", evenNumbers.toString().replaceAll("[\\[\\]]", "")));

    }
}
