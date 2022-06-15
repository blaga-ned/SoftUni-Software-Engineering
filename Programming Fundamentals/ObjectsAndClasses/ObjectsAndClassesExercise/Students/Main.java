package ObjectsAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listOfStudents = new ArrayList<>();
        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= countStudents; student++) {
            String studentInfo = scanner.nextLine();
            //"{first name} {second name} {grade}".split(" ")
            //-> ["{firstName}", "{secondName}", "{grade}"]
            String firstName = studentInfo.split(" ")[0];
            String secondName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student studentObj = new Student(firstName, secondName, grade);
            listOfStudents.add(studentObj);
        }

        //сортираме по оценка -> ascending
        //listOfStudents.sort(Comparator.comparing(Student::getGrade));

        //сортираме по оценка -> descending
        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());


        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}




