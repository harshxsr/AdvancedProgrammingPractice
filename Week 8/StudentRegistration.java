import java.awt.*;
import javax.swing.*;

public class StudentRegistration extends JFrame {

    JTextField name, regno;
    JRadioButton male, female;
    JComboBox<String> dept;
    JButton submit;

    StudentRegistration() {

        setTitle("Student Registration");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        name = new JTextField(20);
        add(name);

        add(new JLabel("Register No:"));
        regno = new JTextField(20);
        add(regno);

        add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        add(new JLabel("Department:"));

        String departments[] = {"CSE", "ECE", "EEE", "MECH"};
        dept = new JComboBox<>(departments);
        add(dept);

        submit = new JButton("Submit");
        add(submit);

        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : "Female";

            JOptionPane.showMessageDialog(this,
                    "Name: " + name.getText() +
                    "\nRegister No: " + regno.getText() +
                    "\nGender: " + gender +
                    "\nDepartment: " + dept.getSelectedItem());
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}