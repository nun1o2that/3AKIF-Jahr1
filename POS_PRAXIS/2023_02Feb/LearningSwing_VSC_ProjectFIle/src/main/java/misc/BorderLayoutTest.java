package misc;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

    public BorderLayoutTest() {

        // layout manager - defines the natural layout for components within a container

        // borderlayout - places components in five areas: NORTH, SOUTH. EAST, WEST, CENTER
        // all extra space is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        // set up borderlayout for container
        // frame.setLayout(new BorderLayout());
        
        // passing margins as parameters for new BorderLayout(): width, height
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        // width, height
        panel1.setPreferredSize(new Dimension(100, 100));   // red; can change height
        panel2.setPreferredSize(new Dimension(100, 100));   // green; can change width
        panel3.setPreferredSize(new Dimension(100, 100));   // yellow; can change width
        panel4.setPreferredSize(new Dimension(100, 100));   // magenta; can change height
        panel5.setPreferredSize(new Dimension(100, 100));   // blue; ???


        // ----------------- sub panels ----------------------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        // panel 5 is also acting as a container, for panels 6-10
        panel5.setLayout(new BorderLayout());

        // width, height
        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.WEST);
        panel5.add(panel10, BorderLayout.CENTER);
        // ----------------------- sub panels -----------------------


        frame.add(panel1, BorderLayout.NORTH);  // red
        frame.add(panel2, BorderLayout.WEST);   // green
        frame.add(panel3, BorderLayout.EAST);   // yellow
        frame.add(panel4, BorderLayout.SOUTH);  // magenta
        frame.add(panel5, BorderLayout.CENTER); // blue

    }

}