package sourcemind;

import java.util.Objects;

public class Cat extends Animal implements Walkable {

    private static int numberOfCats = 0;
    public static Cat whoIsTheBossHere = null;

    public static String describe() {
        return "https://en.wikipedia.org/wiki/Cat";
    }

    public Cat(String name) {
        this(name, 1);
    }

    public Cat(String name, int age) {
        if (numberOfCats == 2) {
            System.err.println("Not enough room");
            System.exit(1);
        }

        this.name = name;
        this.age = age;
        numberOfCats++;
        whoIsTheBossHere = this;
    }

    // Fields - in order to contain data
    private String name;
    private char gender;
    private int age;
    private double weight;
    private String color;

    // Methods
    public void breathe() {

    }

    public String getName() {
        System.out.println("Someone is asking my name");
        return name;
    }

    @Override
    public void walk() {
        System.out.println("Cat's walking");
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cat otherCat = (Cat) obj;
        return Objects.equals(name, otherCat.name) &&
                age == otherCat.age &&
                Objects.equals(gender, otherCat.gender) &&
                Objects.equals(weight, otherCat.weight) &&
                Objects.equals(color, otherCat.color);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, weight, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meowwww");
    }

}

