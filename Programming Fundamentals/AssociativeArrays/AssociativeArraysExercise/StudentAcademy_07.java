package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        students.entrySet()
                .stream()
                .sorted((a, b) -> {
                    double firstAverage = a.getValue()
                            .stream()
                            .mapToDouble(Double :: doubleValue)
                            .average()
                            .getAsDouble();
                    double secondAverage = b.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(secondAverage, firstAverage);
                }).forEach(b ->{
                    double average = b.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    if (average >= 4.50){
                        System.out.printf("%s -> %.2f%n", b.getKey(), average);
                    }
        });
    }
}
