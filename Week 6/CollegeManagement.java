import java.util.Scanner;
import student.Student;
import course.Course;


public class CollegeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();

        Student s = new Student(name, rollNo);
        Course c = new Course(courseName, courseCode);

        s.displayStudent();
        c.displayCourse();

        sc.close();
    }
}