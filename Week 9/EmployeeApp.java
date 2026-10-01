import java.awt.*;
import javax.swing.*;

// MODEL
class EmployeeModel {

    String username = "admin";
    String password = "admin123";

    boolean login(String user, String pass) {

        return username.equals(user)
                && password.equals(pass);
    }

    boolean changePassword(String oldPass,
                           String newPass,
                           String confirmPass) {

        if (!password.equals(oldPass))
            return false;

        if (!newPass.equals(confirmPass))
            return false;

        password = newPass;

        return true;
    }
}

// LOGIN VIEW
class LoginView extends JFrame {

    JTextField username;
    JPasswordField password;
    JButton login;

    LoginView() {

        setTitle("Employee Login");
        setSize(300, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));

        username = new JTextField(15);
        add(username);

        add(new JLabel("Password:"));

        password = new JPasswordField(15);
        add(password);

        login = new JButton("Login");
        add(login);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// MAIN VIEW
class MainView extends JFrame {

    JMenuItem addEmployee;
    JMenuItem viewEmployee;
    JMenuItem changePassword;
    JMenuItem exit;
    JMenuItem logout;
    JMenuItem exitApplication;

    MainView() {

        setTitle("Employee Management Portal");
        setSize(500, 300);

        JMenuBar bar = new JMenuBar();

        JMenu employee = new JMenu("Employee");
        JMenu tools = new JMenu("Tools");

        addEmployee = new JMenuItem("Add Employee");
        viewEmployee = new JMenuItem("View Employee");

        changePassword = new JMenuItem("Change Password");
        exit = new JMenuItem("Exit");

        logout = new JMenuItem("Logout");
        exitApplication = new JMenuItem("Exit Application");

        employee.add(addEmployee);
        employee.add(viewEmployee);

        tools.add(changePassword);
        tools.add(exit);

        bar.add(employee);
        bar.add(tools);
        bar.add(logout);
        bar.add(exitApplication);

        setJMenuBar(bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// MAIN + CONTROLLER
public class EmployeeApp {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel();

        LoginView login = new LoginView();

        // LOGIN
        login.login.addActionListener(e -> {

            String user = login.username.getText();

            String pass =
                new String(login.password.getPassword());

            if (model.login(user, pass)) {

                JOptionPane.showMessageDialog(
                    login,
                    "Login Successful"
                );

                login.dispose();

                MainView main = new MainView();

                // ADD EMPLOYEE
                main.addEmployee.addActionListener(x -> {

                    JTextField id = new JTextField();
                    JTextField name = new JTextField();
                    JTextField dept = new JTextField();

                    Object[] fields = {
                        "Employee ID:", id,
                        "Employee Name:", name,
                        "Department:", dept
                    };

                    int option =
                        JOptionPane.showConfirmDialog(
                            main,
                            fields,
                            "Add Employee",
                            JOptionPane.OK_CANCEL_OPTION
                        );

                    if (option == JOptionPane.OK_OPTION) {

                        JOptionPane.showMessageDialog(
                            main,
                            "Employee Added"
                        );
                    }
                });

                // VIEW EMPLOYEE
                main.viewEmployee.addActionListener(x -> {

                    JOptionPane.showMessageDialog(
                        main,
                        "Employee details displayed here."
                    );
                });

                // CHANGE PASSWORD
                main.changePassword.addActionListener(x -> {

                    JPasswordField oldPass =
                        new JPasswordField();

                    JPasswordField newPass =
                        new JPasswordField();

                    JPasswordField confirmPass =
                        new JPasswordField();

                    Object[] fields = {
                        "Old Password:", oldPass,
                        "New Password:", newPass,
                        "Confirm Password:", confirmPass
                    };

                    int option =
                        JOptionPane.showConfirmDialog(
                            main,
                            fields,
                            "Change Password",
                            JOptionPane.OK_CANCEL_OPTION
                        );

                    if (option == JOptionPane.OK_OPTION) {

                        boolean success =
                            model.changePassword(
                                new String(
                                    oldPass.getPassword()
                                ),
                                new String(
                                    newPass.getPassword()
                                ),
                                new String(
                                    confirmPass.getPassword()
                                )
                            );

                        if (success) {

                            JOptionPane.showMessageDialog(
                                main,
                                "Password Changed Successfully"
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                main,
                                "Invalid old password or passwords do not match"
                            );
                        }
                    }
                });

                // EXIT
                main.exit.addActionListener(x -> {
                    main.dispose();
                });

                // LOGOUT
                main.logout.addActionListener(x -> {

                    main.dispose();

                    new EmployeeApp().startLogin();
                });

                // EXIT APPLICATION
                main.exitApplication.addActionListener(x -> {
                    System.exit(0);
                });

            } else {

                JOptionPane.showMessageDialog(
                    login,
                    "Invalid Username or Password"
                );
            }
        });
    }

    void startLogin() {
        main(null);
    }
}