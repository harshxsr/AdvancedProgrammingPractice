import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Salary : ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        e.display();

        sc.close();
    }
}