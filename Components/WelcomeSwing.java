import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeSwing {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Background Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and a button
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        JLabel messageLabel = new JLabel(""); // Initially empty

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN); // Change background color
                messageLabel.setText("Welcome to Java Swing"); // Set message
            }
        });

        // Add components to panel
        panel.add(button);
        panel.add(messageLabel);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
