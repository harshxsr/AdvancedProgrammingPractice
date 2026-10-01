import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseManagement extends JFrame {

    JList<String> courses;
    JTable table;
    DefaultTableModel model;
    JButton add, remove;

    CourseManagement() {

        setTitle("Course Management");
        setSize(600, 400);
        setLayout(new FlowLayout());

        String courseList[] = {
            "Java",
            "Python",
            "Data Structures",
            "Operating Systems"
        };

        courses = new JList<>(courseList);
        add(new JScrollPane(courses));

        model = new DefaultTableModel(
                new String[]{"Student Name", "Course", "Status"}, 0);

        table = new JTable(model);
        add(new JScrollPane(table));

        add = new JButton("Add Course");
        remove = new JButton("Remove Course");

        add(add);
        add(remove);

        add.addActionListener(e -> {

            String course = courses.getSelectedValue();

            if (course != null) {
                model.addRow(
                    new Object[]{"Student", course, "Enrolled"}
                );
            }
        });

        remove.addActionListener(e -> {

            int row = table.getSelectedRow();

            if (row != -1) {
                model.removeRow(row);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CourseManagement();
    }
}