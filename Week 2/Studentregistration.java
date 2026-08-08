class Student {
    String name;
    int rollno;

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollno);
    }
}

public class Studentregistration {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Rahul";
        s.rollno = 101;

        s.display();
    }
}