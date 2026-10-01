import java.awt.*;
import javax.swing.*;

// MODEL
class StudentModel {
    String name;
    int m1, m2, m3;
    int total;
    double average;
    String grade;

    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }
}

// VIEW
class StudentView extends JFrame {

    JTextField name, m1, m2, m3;
    JButton calculate;
    JLabel result;

    StudentView() {

        setTitle("Student Grade Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Subject 1:"));
        m1 = new JTextField(10);
        add(m1);

        add(new JLabel("Subject 2:"));
        m2 = new JTextField(10);
        add(m2);

        add(new JLabel("Subject 3:"));
        m3 = new JTextField(10);
        add(m3);

        calculate = new JButton("Calculate Result");
        add(calculate);

        result = new JLabel();
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// CONTROLLER
class StudentController {

    StudentModel model;
    StudentView view;

    StudentController(StudentModel model, StudentView view) {

        this.model = model;
        this.view = view;

        view.calculate.addActionListener(e -> {

            model.name = view.name.getText();
            model.m1 = Integer.parseInt(view.m1.getText());
            model.m2 = Integer.parseInt(view.m2.getText());
            model.m3 = Integer.parseInt(view.m3.getText());

            model.calculate();

            view.result.setText(
                "Total: " + model.total +
                "  Average: " + model.average +
                "  Grade: " + model.grade
            );
        });
    }
}

// MAIN
public class GradeApp {

    public static void main(String[] args) {

        StudentModel model = new StudentModel();
        StudentView view = new StudentView();

        new StudentController(model, view);
    }
}