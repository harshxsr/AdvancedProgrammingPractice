class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Professor extends Employee {

    Professor(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + 20000;
    }
}

class LabAssistant extends Employee {

    LabAssistant(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + 10000;
    }
}

class AdministrativeStaff extends Employee {

    AdministrativeStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + 5000;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Employee e1 = new Professor("Arun", 101, 50000);
        Employee e2 = new LabAssistant("Ravi", 102, 30000);
        Employee e3 = new AdministrativeStaff("Priya", 103, 25000);

        System.out.println("Professor Salary: " + e1.calculateSalary());
        System.out.println("Lab Assistant Salary: " + e2.calculateSalary());
        System.out.println("Administrative Staff Salary: " + e3.calculateSalary());
    }
}