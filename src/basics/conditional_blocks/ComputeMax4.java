package basics.conditional_blocks;

import java.util.Scanner;

public class ComputeMax4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get first value from user
        System.out.print("Enter a number: ");
        int var_a = scanner.nextInt();

        // Get second value from user
        System.out.print("Enter another number: ");
        int var_b = scanner.nextInt();


        System.out.println(isGreaterThan(var_a, var_b) ? var_a + " is greater than " + var_b
                : var_b + " is greater than " + var_a);
    }

    private static boolean isGreaterThan(int var_a, int var_b) {
        return var_a > var_b;
    }
}
