package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {

        Names names = new Names();

        List<String> namesList = new ArrayList<>();
        namesList.addAll(names.getNames());

        List<String> newList = new ArrayList<>();
        Collections.sort(namesList);

        char previous_character = namesList.get(0).charAt(0);
        newList.add(Character.toString(previous_character));
        newList.add(namesList.get(0));

        for (int i = 1; i < namesList.size(); i++) {
            char first_char = namesList.get(i).charAt(0);
            if (first_char != previous_character) {
                newList.add(Character.toString(first_char));
                newList.add(namesList.get(i));
                previous_character = first_char;
            }
        }

        for (String name : newList) {
            System.out.println(name);
        }


    }


}
