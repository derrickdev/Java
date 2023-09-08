
import java.util.Scanner;

public class largerNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println(" enter a number");
        int number1 =scanner.nextInt();

        System.out.println("enter a second number");
        int number2 = scanner.nextInt();


        int maxNumber = Math.max(number1, number2);

        System.out.println("the larger number is : " + maxNumber);
    }
}
