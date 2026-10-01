import java.util.Scanner;

public class StudentPerformance {

    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    StudentPerformance(int rollNo, String name, int m1, int m2, int m3, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        this.attendance = attendance;
    }

    void display() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        double average = total / 3.0;

        String result = average >= 50 ? "Pass" : "Fail";

        String scholarship = (average >= 75 && attendance >= 80)
                ? "Eligible"
                : "Not Eligible";

        String performance = average >= 85 ? "Excellent" : "Good";

        System.out.println("\nRoll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
    }

    double getAverage() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        return total / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentPerformance[] students = new StudentPerformance[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks in Subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Marks in Subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Marks in Subject 3: ");
            int m3 = sc.nextInt();

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new StudentPerformance(
                    rollNo, name, m1, m2, m3, attendance
            );
        }

        System.out.println("\n===== STUDENT PERFORMANCE =====");

        int highestIndex = 0;

        for (int i = 0; i < 5; i++) {
            students[i].display();

            if (students[i].getAverage() > students[highestIndex].getAverage()) {
                highestIndex = i;
            }
        }

        System.out.println("\n===== HIGHEST AVERAGE =====");
        System.out.println("Name: " + students[highestIndex].name);
        System.out.println("Average: " + students[highestIndex].getAverage());

        sc.close();
    }
}