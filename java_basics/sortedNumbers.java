import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


    public class sortedNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            System.out.println("Enter some numbers and write (end) when you finish ");
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                numbers.add(number);
            }

            Collections.sort(numbers);
            for (int number : numbers) {
                System.out.println(number);
            }

        }
    }
