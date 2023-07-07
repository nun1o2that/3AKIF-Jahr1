package misc;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {

    public FlowLayoutTest() {

        // layout manager - defines the natural layout for components within a container

        // places components in a row, sized at their preferred size
        // if the horizontal space in the container is too small, the flowlayout class uses the next available row

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(new FlowLayout());

        // set alignments for components
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); //components stick LEFT
        // default: FlowLayout.CENTER
        // right side: FlowLayout.TRAILING 

        // set space around components ( horizontal, vertical distance ) 
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        // by default, panels use FlowLayout
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true);

    }

}