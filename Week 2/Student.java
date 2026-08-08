class StudentDetails {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Student {
    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();

        s1.name = "Rahul";
        s1.age = 19;

        s2.name = "Aman";
        s2.age = 20;

        System.out.println("Student 1");
        s1.display();

        System.out.println();

        System.out.println("Student 2");
        s2.display();
    }
}