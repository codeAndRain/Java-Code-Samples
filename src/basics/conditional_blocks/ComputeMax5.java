package basics.conditional_blocks;

import java.util.Scanner;

public class ComputeMax5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get first value from user
        System.out.print("Enter a number: ");
        int var_a = scanner.nextInt();

        // Get second value from user
        System.out.print("Enter another number: ");
        int var_b = scanner.nextInt();

        computeMax(var_a, var_b);
    }

    private static void computeMax(int var_a, int var_b) {
        System.out.println(var_a > var_b ? var_a + " is greater than " + var_b
                : var_b + " is greater than " + var_a);
    }
}
