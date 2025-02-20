import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Blackjack {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Blackjack::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("User Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField();

        JLabel balanceLabel = new JLabel("Enter starting balance:");
        JTextField balanceField = new JTextField();

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String balanceText = balanceField.getText();

                try {
                    double balance = Double.parseDouble(balanceText);
                    JOptionPane.showMessageDialog(frame, "Welcome, " + name + "! Your starting balance is $" + balance);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the balance.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(balanceLabel);
        frame.add(balanceField);
        frame.add(new JLabel()); // Placeholder for layout
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
