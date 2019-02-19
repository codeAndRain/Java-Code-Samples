package basics.classes.room;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name;
    private  final int size;
    private int num_people;
    private List<Person> personList = new ArrayList<>();


    public Room(String name, int size) {
        this.name = name;
        this.size = size;

        // set persons
        Person luke = new Person("Luke", "Jones");
        Person anna = new Person("Anna", "Wise");
        Person carla =  new Person("Carla", "Bianchi");

        List<Person> personList = new ArrayList<>();
        personList.add(luke);
        personList.add(anna);
        personList.add(carla);

        setPersonList(personList);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getNum_people() {
        return personList.size();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
