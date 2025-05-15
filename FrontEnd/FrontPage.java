package FrontEnd;

import javax.swing.*;

public class FrontPage 
{
     public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("My Swing Window");

        // Set size of the window (width, height)
        frame.setSize(400, 300);

        // Exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel and add it to the frame
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
  
}
