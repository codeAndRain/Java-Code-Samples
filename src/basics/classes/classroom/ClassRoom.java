package basics.classes.classroom;

public class ClassRoom {
    private  Student student;
    private final int size;
    private String name;


    public ClassRoom(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
