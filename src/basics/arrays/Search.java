package basics.arrays;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        String[] names = getNames();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to replace: ");
        String nameToReplace = scanner.next();

        boolean isNameFound = findName(names, nameToReplace);

        if (isNameFound) {
            System.out.println(nameToReplace + " found");
        } else {
            System.out.println(nameToReplace + " not found");
        }
    }

    private static String[] getNames() {
        String[] names = new String[5];
        names[0] = "Anna";
        names[1] = "Brooklyn";
        names[2] = "Shawn";
        names[3] = "Linda";
        names[4] = "John";

        return names;
    }

    private static boolean findName(String[] names, String searchName) {
        for (String name : names) {
            if (name.equals(searchName)) {
                return true;
            }
        }
        return false;
    }
}
