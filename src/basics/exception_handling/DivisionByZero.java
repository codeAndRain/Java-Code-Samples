package basics.exception_handling;

import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        computeDivision(number, divisor);

    }

    private static void computeDivision(int number, int divisor) {
        int fraction;
        try {
            fraction =  number / divisor;
            System.out.println(number + " / " + divisor + " = " + fraction);

        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e);
        }
    }

}
