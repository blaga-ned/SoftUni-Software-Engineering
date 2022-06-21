package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.*;

public class AverageStudentsGrade_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsNamesAndGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("\\s+");
            String name = text[0];
            double grade = Double.parseDouble(text[1]);

            if (!studentsNamesAndGrades.containsKey(name)) {
                studentsNamesAndGrades.put(name, new ArrayList<>());
                studentsNamesAndGrades.get(name).add(grade);

            } else {
                studentsNamesAndGrades.get(name).add(grade);

            }
        }
        studentsNamesAndGrades.entrySet().stream()
                .forEach((entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double averageSum = sum / entry.getValue().size();
                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", averageSum);
                }));


    }
}

