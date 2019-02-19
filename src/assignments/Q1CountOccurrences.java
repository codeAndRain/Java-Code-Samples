package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * print name with max occurrence of some character.
 */
public class Q1CountOccurrences {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        Names names = new Names();
        namesList.addAll(names.getNames());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");

        String letter = scanner.next();
        char char_letter = letter.charAt(0);

        int max = 0;
        for (String name : namesList) {
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (char_letter == name.charAt(i)) {
                    count++;
                }

                if (count > max) {
                    max = count;
                }
            }

            if (max == count) {
                System.out.println(name + " has " + max + " occurrences");
            }
        }
    }
}
