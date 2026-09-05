import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EmployeeRegistration1 extends JFrame implements ActionListener {

    JLabel idLabel, nameLabel, departmentLabel, salaryLabel;

    JTextField idField, nameField, salaryField;

    JComboBox<String> departmentBox;

    JButton submitButton, clearButton;

    EmployeeRegistration1() {

        // Frame settings
        setTitle("Employee Registration Form");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Employee ID
        idLabel = new JLabel("Employee ID:");
        idField = new JTextField();

        // Employee Name
        nameLabel = new JLabel("Employee Name:");
        nameField = new JTextField();

        // Department
        departmentLabel = new JLabel("Department:");

        String[] departments = {
            "Computer Engineering",
            "Human Resources",
            "Finance",
            "Marketing",
            "Sales"
        };

        departmentBox = new JComboBox<>(departments);

        // Salary
        salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField();

        // Buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        // Add ActionListener
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components
        add(idLabel);
        add(idField);

        add(nameLabel);
        add(nameField);

        add(departmentLabel);
        add(departmentBox);

        add(salaryLabel);
        add(salaryField);

        add(submitButton);
        add(clearButton);

        // Center the window
        setLocationRelativeTo(null);

        // Display the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Submit button
        if (e.getSource() == submitButton) {

            String employeeId = idField.getText();
            String name = nameField.getText();
            String department =
                    (String) departmentBox.getSelectedItem();
            String salary = salaryField.getText();

            // Check empty fields
            if (employeeId.isEmpty() ||
                name.isEmpty() ||
                salary.isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please fill all the fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            // Display employee information
            JOptionPane.showMessageDialog(
                this,
                "Employee Registered Successfully!\n\n" +
                "Employee ID: " + employeeId + "\n" +
                "Name: " + name + "\n" +
                "Department: " + department + "\n" +
                "Salary: " + salary,
                "Employee Details",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        // Clear button
        if (e.getSource() == clearButton) {

            idField.setText("");
            nameField.setText("");
            salaryField.setText("");

            departmentBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {

        new EmployeeRegistration1();
    }
}