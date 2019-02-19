package basics.switch_statement;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year, i.e 1999: ");
        int year = scanner.nextInt();

        int numDays = 0;

        numDays = getNumDays(month, year);
        System.out.println("Number of Days = "
                + numDays);
    }

    private static int getNumDays(int month, int year) {
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0)) {
                    // is leap year
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        return numDays;
    }
}
