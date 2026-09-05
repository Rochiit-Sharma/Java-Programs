import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BankBalance1 extends JFrame implements ActionListener {

    JLabel balanceLabel, transactionLabel, resultLabel;

    JTextField balanceField, transactionField, resultField;

    JButton depositButton, withdrawButton, clearButton;

    BankBalance1() {

        setTitle("Bank Balance Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2, 10, 10));

        // Initial Balance
        balanceLabel = new JLabel("Initial Balance:");
        balanceField = new JTextField();

        // Transaction Amount
        transactionLabel = new JLabel("Transaction Amount:");
        transactionField = new JTextField();

        // Updated Balance
        resultLabel = new JLabel("Updated Balance:");
        resultField = new JTextField();
        resultField.setEditable(false);

        // Buttons
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        clearButton = new JButton("Clear");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Row 1
        add(balanceLabel);
        add(balanceField);

        // Row 2
        add(transactionLabel);
        add(transactionField);

        // Row 3
        add(resultLabel);
        add(resultField);

        // Row 4 - Buttons
        JPanel buttonPanel = new JPanel();

        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(clearButton);

        add(new JLabel(""));
        add(buttonPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearButton) {

            balanceField.setText("");
            transactionField.setText("");
            resultField.setText("");

            return;
        }

        try {

            double balance =
                Double.parseDouble(balanceField.getText());

            double transaction =
                Double.parseDouble(transactionField.getText());

            if (transaction < 0) {

                JOptionPane.showMessageDialog(
                    this,
                    "Transaction amount cannot be negative!"
                );

                return;
            }

            if (e.getSource() == depositButton) {

                double updatedBalance = balance + transaction;

                resultField.setText(
                    String.valueOf(updatedBalance)
                );
            }

            else if (e.getSource() == withdrawButton) {

                if (transaction > balance) {

                    JOptionPane.showMessageDialog(
                        this,
                        "Insufficient Balance!"
                    );

                } else {

                    double updatedBalance = balance - transaction;

                    resultField.setText(
                        String.valueOf(updatedBalance)
                    );
                }
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Please enter valid numbers!"
            );
        }
    }

    public static void main(String[] args) {

        new BankBalance1();
    }
}