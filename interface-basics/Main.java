package sourcemind;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy", 2);
        Cat cat2 = new Cat("Fluffy", 2);
        Cat cat3 = new Cat("Mittens", 3);

        System.out.println("cat1.equals(cat2): " + cat1.equals(cat2)); // true
        System.out.println("cat1.equals(cat3): " + cat1.equals(cat3)); // false

        System.out.println("cat1.hashCode(): " + cat1.hashCode());
        System.out.println("cat2.hashCode(): " + cat2.hashCode());
        System.out.println("cat3.hashCode(): " + cat3.hashCode());
    }
}









