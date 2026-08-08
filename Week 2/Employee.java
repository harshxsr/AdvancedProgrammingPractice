class EmployeeDetails {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {

        EmployeeDetails e1 = new EmployeeDetails();
        EmployeeDetails e2 = new EmployeeDetails();

        e1.id = 101;
        e1.name = "Rahul";
        e1.salary = 45000;

        e2.id = 102;
        e2.name = "Aman";
        e2.salary = 50000;

        System.out.println("Employee 1");
        e1.display();

        System.out.println();

        System.out.println("Employee 2");
        e2.display();
    }
}