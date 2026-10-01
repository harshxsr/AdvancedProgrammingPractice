import java.awt.*;
import javax.swing.*;

// MODEL
class ServiceModel {

    int calculateCost(boolean general,
                      boolean oil,
                      boolean brake,
                      boolean battery) {

        int cost = 0;

        if (general)
            cost += 1000;

        if (oil)
            cost += 800;

        if (brake)
            cost += 1200;

        if (battery)
            cost += 500;

        return cost;
    }
}

// VIEW
class ServiceView extends JFrame {

    JTextField regNo;

    JRadioButton twoWheeler, car;

    JCheckBox general, oil, brake, battery;

    JButton calculate;

    JLabel result;

    ServiceView(ServiceModel model) {

        setTitle("Vehicle Service Cost Estimator");
        setSize(450, 350);
        setLayout(new FlowLayout());

        add(new JLabel("Registration Number:"));

        regNo = new JTextField(15);
        add(regNo);

        add(new JLabel("Vehicle Type:"));

        twoWheeler = new JRadioButton("Two Wheeler");
        car = new JRadioButton("Car");

        ButtonGroup group = new ButtonGroup();
        group.add(twoWheeler);
        group.add(car);

        add(twoWheeler);
        add(car);

        add(new JLabel("Services:"));

        general = new JCheckBox("General Service - Rs.1000");
        oil = new JCheckBox("Oil Change - Rs.800");
        brake = new JCheckBox("Brake Service - Rs.1200");
        battery = new JCheckBox("Battery Check - Rs.500");

        add(general);
        add(oil);
        add(brake);
        add(battery);

        calculate = new JButton("Calculate Cost");
        add(calculate);

        result = new JLabel();
        add(result);

        calculate.addActionListener(e -> {

            int cost = model.calculateCost(
                general.isSelected(),
                oil.isSelected(),
                brake.isSelected(),
                battery.isSelected()
            );

            result.setText("Total Service Cost: Rs." + cost);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// MAIN
public class ServiceApp {

    public static void main(String[] args) {

        ServiceModel model = new ServiceModel();

        new ServiceView(model);
    }
}