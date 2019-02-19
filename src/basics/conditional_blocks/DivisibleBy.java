package basics.conditional_blocks;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int digit = scanner.nextInt();
        System.out.println("Enter number to divide by : ");
        int divisible_by = scanner.nextInt();

        System.out.println(isDivisible(digit, divisible_by ) ? digit + " is divisible by " + divisible_by
        : digit + " is not divisible by " + divisible_by);

    }

    private static boolean isDivisible(int digit, int divisible_by) {
        return digit % divisible_by == 0;
    }
}
