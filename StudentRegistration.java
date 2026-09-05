import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel rollLabel = new JLabel("Roll No:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel courseLabel = new JLabel("Course:");
        JLabel emailLabel = new JLabel("Email:");

        JTextField nameField = new JTextField();
        JTextField rollField = new JTextField();
        JTextField emailField = new JTextField();

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        String[] courses = {"Computer Engineering", "IT", "ENTC", "Mechanical"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JButton registerButton = new JButton("Register");
        JButton clearButton = new JButton("Clear");

        frame.setLayout(new GridLayout(6, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(genderLabel);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        frame.add(courseLabel);
        frame.add(courseBox);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(registerButton);
        frame.add(clearButton);

        // Register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String roll = rollField.getText();
                String email = emailField.getText();

                String gender = "";

                if (male.isSelected()) {
                    gender = "Male";
                } else if (female.isSelected()) {
                    gender = "Female";
                }

                String course = (String) courseBox.getSelectedItem();

                JOptionPane.showMessageDialog(
                        frame,
                        "Registration Successful!\n\n" +
                        "Name: " + name +
                        "\nRoll No: " + roll +
                        "\nGender: " + gender +
                        "\nCourse: " + course +
                        "\nEmail: " + email
                );
            }
        });

        // Clear button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                nameField.setText("");
                rollField.setText("");
                emailField.setText("");

                genderGroup.clearSelection();
                courseBox.setSelectedIndex(0);
            }
        });

        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}