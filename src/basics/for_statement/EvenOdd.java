package basics.for_statement;

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
        for (int i = lower_bound; i < upper_bound; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
