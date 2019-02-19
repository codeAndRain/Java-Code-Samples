package assignments;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove vowels
 * print names where first two characters are equal
 */
public class Q2RemoveVowels {

    public static void main(String[] args) {

        Names names = new Names();

        List<String> namesList = new ArrayList<>();
        namesList.addAll(names.getNames());

        for (String name : namesList) {
            String newName = removeVowels(name);

            if (newName.length() >= 2) {
                if (newName.substring(0, 1).equalsIgnoreCase(newName.substring(1, 2))) {
                    System.out.println(newName);
                }
            }
        }


    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'A'
                || letter == 'e' || letter == 'E'
                || letter == 'i' || letter == 'I'
                || letter == 'o' || letter == 'O'
                || letter == 'u' || letter == 'U';
    }

    private static String removeVowels(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (!isVowel(letter)) {
                stringBuilder.append(letter);
            }
        }
        return stringBuilder.toString();
    }
}
