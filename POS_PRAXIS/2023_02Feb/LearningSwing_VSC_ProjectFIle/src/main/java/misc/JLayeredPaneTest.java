package misc;
import javax.swing.*;
import java.awt.*;

public class JLayeredPaneTest {
    
    public JLayeredPaneTest() {

        // jlayeredpane - swing container that provides a 3rd dimension for positioning components

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLayeredPane layer1 = new JLayeredPane();
        layer1.setBounds(0, 0, 500, 500);

        JLabel label1 = new JLabel();
        label1.setOpaque(true); // so it's visible
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true); // so it's visible
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true); // so it's visible
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        // by default, first added component is placed on TOP
        // layers from lowest to highest:
        // Default, Palette, Modal, PopUp, Drag

        // layer1.add(label1);
        // layer1.add(label2);  // passing without parameters -> label1 is on top
        // layer1.add(label3);

        layer1.add(label1, JLayeredPane.DEFAULT_LAYER);
        layer1.add(label1, JLayeredPane.DEFAULT_LAYER);
        layer1.add(label1, JLayeredPane.DRAG_LAYER);
        // ALSO DOABLE WITH INTEGER WRAPPER CLASS
        // layer1.add(label1, Integer.valueOf(0));



        frame.add(layer1);

        frame.setVisible(true);

    }

}
