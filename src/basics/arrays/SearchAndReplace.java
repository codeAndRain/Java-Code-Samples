package basics.arrays;

import java.util.Scanner;

public class SearchAndReplace {

    public static void main(String[] args) {

        String[] names = getNames();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to replace: ");
        String nameToReplace = scanner.next();

        int namePosition = findNamePosition(names, nameToReplace);

        if (namePosition != -1) { // name found
            System.out.print("Enter new name: ");
            String newName = scanner.next();

            String[] newNames = replaceNameAtPosition(names, newName, namePosition);
            printArray(newNames);
        } else { // name not found
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

    private static int findNamePosition(String[] names, String searchName) {
        for (int pos = 0; pos < names.length; pos++) {
            if (names[pos].equals(searchName)) {
                return pos;
            }
        }
        return -1; // placeholder value to indicate that the position has not been found
    }

    private static String[] replaceNameAtPosition(String[] names, String newName, int position) {
        for (int i = 0; i < names.length; i++) {
            if (i == position) {
                names[i] = newName; // assign new name to position i
            }
        }
        return names;
    }

    private static void printArray(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
