package assignments;

import java.util.ArrayList;
import java.util.List;

public class Q4VowelsAndConsonants {

    public static void main(String[] args) {


        Names names = new Names();

        List<String> namesList = new ArrayList<>();
        namesList.addAll(names.getNames());

        List<String> newNamesList = new ArrayList<>();

        char first_char = namesList.get(0).charAt(0);

        for (String name : newNamesList) {
            System.out.println(name);
        }

        isVowelOrConsonant(newNamesList, first_char);
        newNamesList.add(namesList.get(0));

        for (int i = 1; i < namesList.size(); i++) {
            String nextItem = namesList.get(i);
            char first_letter = nextItem.charAt(0);
            if (isVowel(first_letter)) {
                newNamesList.add("Vowel");
                newNamesList.add(nextItem);
            } else {
                newNamesList.add("Consonant");
                newNamesList.add(nextItem);
            }
        }

        for (String name : newNamesList) {
            System.out.println(name);
        }

    }

    private static void isVowelOrConsonant(List<String> namesList, char first_char) {
        if (isVowel(first_char)) {
            namesList.add(0, "Vowel");
        } else {
            namesList.add(0, "Consonant");
        }
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'A'
                || letter == 'e' || letter == 'E'
                || letter == 'i' || letter == 'I'
                || letter == 'o' || letter == 'O'
                || letter == 'u' || letter == 'U';
    }
}
