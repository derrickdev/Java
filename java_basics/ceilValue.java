import java.util.Scanner;

public class ceilValue {
    public static  void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a real number");
        double number = scanner.nextDouble();
        System.out.println("Ceil Value of " + number +" is " + Math.ceil(number));

    }
}
