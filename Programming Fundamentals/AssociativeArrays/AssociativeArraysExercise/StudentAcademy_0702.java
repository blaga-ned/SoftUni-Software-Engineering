package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy_0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(studentName)){
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade);

        }
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()){
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            //moje i taka
            //double averageGrade = grades.stream().mapToDouble(x -> x).average().getAsDouble();
            if (averageGrade >= 4.50){
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades){
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
