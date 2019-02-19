package basics.conditional_blocks;


import java.util.Scanner;

public class ComputeMax2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Get first value from user
        System.out.print("Enter a number: ");
        int var_a = scanner.nextInt();

        // Get second value from user
        System.out.print("Enter another number: ");
        int var_b = scanner.nextInt();


        if (var_a > var_b) {
            System.out.println(var_a + " is greater than " + var_b);
        } else {
            System.out.println(var_b + " is greater than " + var_a);
        }

    }
}
