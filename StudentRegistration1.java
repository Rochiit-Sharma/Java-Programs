import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentRegistration1 extends JFrame implements ActionListener {

    JLabel nameLabel, ageLabel, genderLabel, courseLabel, emailLabel, phoneLabel;

    JTextField nameField, ageField, emailField, phoneField;

    JRadioButton maleButton, femaleButton, otherButton;

    JComboBox<String> courseBox;

    JButton registerButton, clearButton;

    public StudentRegistration1() {

        
        setTitle("Student Registration Form");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        
        ageLabel = new JLabel("Age:");
        ageField = new JTextField();

        
        genderLabel = new JLabel("Gender:");

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");

        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);

        
        courseLabel = new JLabel("Course:");

        String[] courses = {
            "Computer Engineering",
            "Information Technology",
            "Electronics Engineering",
            "Mechanical Engineering",
            "Civil Engineering"
        };

        courseBox = new JComboBox<>(courses);

        // Email
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        // Phone
        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();

        // Buttons
        registerButton = new JButton("Register");
        clearButton = new JButton("Clear");

        // Add ActionListener
        registerButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to frame
        add(nameLabel);
        add(nameField);

        add(ageLabel);
        add(ageField);

        add(genderLabel);
        add(genderPanel);

        add(courseLabel);
        add(courseBox);

        add(emailLabel);
        add(emailField);

        add(phoneLabel);
        add(phoneField);

        add(registerButton);
        add(clearButton);

    
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {

        // Register button
        if (e.getSource() == registerButton) {

            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            String course = (String) courseBox.getSelectedItem();

            String gender = "";

            if (maleButton.isSelected()) {
                gender = "Male";
            }
            else if (femaleButton.isSelected()) {
                gender = "Female";
            }
            else if (otherButton.isSelected()) {
                gender = "Other";
            }

            
            if (name.isEmpty() || age.isEmpty() ||
                email.isEmpty() || phone.isEmpty() ||
                gender.isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please fill all the fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            
            JOptionPane.showMessageDialog(
                this,
                "Student Registered Successfully!\n\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Course: " + course + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone,
                "Registration Details",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        // Clear button
        else if (e.getSource() == clearButton) {

            nameField.setText("");
            ageField.setText("");
            emailField.setText("");
            phoneField.setText("");

            maleButton.setSelected(false);
            femaleButton.setSelected(false);
            otherButton.setSelected(false);

            courseBox.setSelectedIndex(0);
        }
    }

    
    public static void main(String[] args) {

        new StudentRegistration1();
    }
}