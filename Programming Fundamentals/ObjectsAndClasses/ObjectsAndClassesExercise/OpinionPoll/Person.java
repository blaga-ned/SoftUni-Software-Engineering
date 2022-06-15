package ObjectsAndClassesExercise.OpinionPoll;

public class Person {
    private String name;
    private int age;

    //методи (възможните действия)
    //конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter -> name
    public String getName() {
        return this.name;
    }

    //getter -> age
    public int getAge() {
        return this.age;
    }

}
