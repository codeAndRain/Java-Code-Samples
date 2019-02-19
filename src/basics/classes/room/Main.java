package basics.classes.room;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Room room = new Room("Training Room - 107", 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String searchName = scanner.next();

        List<Person> personList = room.getPersonList();

        for (int i = 0; i < personList.size(); i++) {

            Person person = personList.get(i);

            if (person.getFirstName().equals(searchName)) {

                personList.remove(person);
            }
        }

        System.out.println("Current People...");
        for (Person person : room.getPersonList()) {
            System.out.println(person.getFirstName());
        }
    }
}
