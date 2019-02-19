package basics.while_statement;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound value: ");
        int lower_bound = scanner.nextInt();
        System.out.print("Enter upper bound value: ");
        int upper_bound = scanner.nextInt();

        computeEven(lower_bound, upper_bound);
    }

    private static void computeEven(int lower_bound, int upper_bound) {
        int counter = lower_bound;
        while (counter <= upper_bound) {
            if (counter % 2 == 0) {
                System.out.println(counter + " is even");
            } else {
                System.out.println(counter + " is odd");
            }
            counter++;
        }
    }
}
