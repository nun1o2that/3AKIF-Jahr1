package misc;
import javax.swing.*;
import java.awt.*;


public class GridLayoutTest {
    
    public GridLayoutTest() {

        // layout manager - defines the natural layout for components within a container

        // gridlayout - places components in a grid of cells
        // each component takes all the available space within its cell, and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(new GridLayout());  // all components in 1 row

        // PARAMETERS: rows, columns
        // frame.setLayout(new GridLayout(3, 3));

        // TWO MORE PARAMETERS: horizontal, vertical spacing between components
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }

}
