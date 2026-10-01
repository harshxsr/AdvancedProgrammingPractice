import java.awt.*;
import javax.swing.*;

public class UserLogin extends JFrame {

    JTextField username;
    JPasswordField password;
    JCheckBox remember, notifications;
    JButton login;

    UserLogin() {

        setTitle("User Login");
        setSize(350, 250);
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        username = new JTextField(20);
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField(20);
        add(password);

        remember = new JCheckBox("Remember Me");
        notifications = new JCheckBox("Receive Notifications");

        add(remember);
        add(notifications);

        login = new JButton("Login");
        add(login);

        login.addActionListener(e -> {

            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this,
                        "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserLogin();
    }
}