package student;
public class Student {
    String name; int id; String course;
    public Student(String name, int id, String course) {
        this.name = name; this.id = id; this.course = course;
    }
    public void display() {
        System.out.println("Student: " + name + " | ID: " + id + " | Course: " + course);
    }
}
