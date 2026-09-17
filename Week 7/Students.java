import course.Course;
import student.Student;
public class Students {
    public static void main(String[] args) {
        Student s = new Student("Franky", 101, "CSE");
        Course c = new Course("Computer Science", 4);
        s.display();
        c.display();
    }
}