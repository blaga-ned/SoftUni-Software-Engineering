package Polymorphism.Animals;

public class Cat extends Animal{
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }
    @Override
    public String explainSelf() {
        return String.format("I am Oscar and my favourite food is Whiskas\n" +
                "MEEOW%n");
    }
}
