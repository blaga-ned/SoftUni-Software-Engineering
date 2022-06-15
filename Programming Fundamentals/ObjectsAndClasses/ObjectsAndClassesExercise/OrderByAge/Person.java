package ObjectsAndClassesExercise.OrderByAge;

public class Person {
    //полета -> характеристики
    private String name;
    private String id;
    private int age;

    //конструктор
    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //getter -> age
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        //"{name} with ID: {id} is {age} years old."
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
