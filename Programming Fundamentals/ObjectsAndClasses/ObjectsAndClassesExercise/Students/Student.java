package ObjectsAndClassesExercise.Students;

public class Student {
    //полета -> характеристики
    private String firstName;
    private String secondName;
    private double grade;

    //конструктор
    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    //getter -> grade
    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //обект -> текст
        //"{first name} {second name}: {grade}"
        return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
    }
}
