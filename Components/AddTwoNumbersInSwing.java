import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbersInSwing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Sum Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel label1 = new JLabel("Enter number 1:");
        JTextField text1 = new JTextField(10);

        JLabel label2 = new JLabel("Enter number 2:");
        JTextField text2 = new JTextField(10);

        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    
                    resultLabel.setText("Result: " +( num1+num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(addButton);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
