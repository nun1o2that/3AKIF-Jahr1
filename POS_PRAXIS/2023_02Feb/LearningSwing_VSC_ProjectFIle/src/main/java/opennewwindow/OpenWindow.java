package opennewwindow;
import javax.swing.*;
import java.awt.*;

public class OpenWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    public OpenWindow() {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));

        frame.add(label);
        frame.setVisible(true);

    }

}