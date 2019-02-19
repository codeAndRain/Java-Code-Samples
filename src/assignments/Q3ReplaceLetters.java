package assignments;

import java.util.ArrayList;
import java.util.List;

/**
 * Replace first letter with the last letter.
 */
public class Q3ReplaceLetters {

    public static void main(String[] args) {

        Names names = new Names();

        List<String> namesList = new ArrayList<>();
        namesList.addAll(names.getNames());

        for (String name : namesList) {
            String newName = replaceFirstWithLast(name);
            System.out.println(newName);
        }
    }

    private static String replaceFirstWithLast(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        if (name.length() >= 2) {
            char first = name.charAt(0);
            char last = name.charAt(name.length() - 1);

            stringBuilder.append(last);
            stringBuilder.append(name.substring(1, name.length() - 1));
            stringBuilder.append(first);

        }
        return stringBuilder.toString();
    }


}
