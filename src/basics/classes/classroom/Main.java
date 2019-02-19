package basics.classes.classroom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom("A-107", 10);
        List<Student> studentList = new ArrayList<>();

        // create new students based on the room size
        for (int i = 0; i < classRoom.getSize(); i++) {
            studentList.add(new Student("student_" + i));
        }

        // print all students
        for (Student student : studentList) {
            System.out.println(student.getFirstName());
        }

    }
}
