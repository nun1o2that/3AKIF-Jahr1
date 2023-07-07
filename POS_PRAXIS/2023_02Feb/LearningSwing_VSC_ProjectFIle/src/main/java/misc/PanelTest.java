package misc;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PanelTest implements ActionListener {
    
    JButton button;
    JFrame frame;
    int i;

    public PanelTest() {

        i = 0;

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(null);


        JLabel redlabel = new JLabel();
        redlabel.setText("i'm in here whoah!!!");
        redlabel.setBounds(10, 10, 150, 20);
        redlabel.setBackground(Color.black);
        redlabel.setForeground(Color.white);

        JLabel bluelabel = new JLabel();
        bluelabel.setText("i'm blue dabudeedabudie");
        bluelabel.setBounds(10, 10, 150, 20);
        bluelabel.setBackground(Color.black);
        bluelabel.setForeground(Color.white);

        JLabel greenlabel = new JLabel();
        greenlabel.setText("weed");
        greenlabel.setBounds(245, 10, 150, 20);
        greenlabel.setBackground(Color.black);
        greenlabel.setForeground(Color.white);


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        Border border = BorderFactory.createLineBorder(Color.black, 4);

        button = new JButton();
        button.addActionListener(this); // bc class implements AcionListener
        button.setBounds(100, 100, 100, 60);
        button.setText("hi");
        button.setFocusable(false); // disables ugly box around button text
        // button.setIcon(icon);
        // button.setHorizontalTextPosition , setVerticalTextPosition  
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(border);
        // button.setEnabled(false); to disable a button


        redpanel.add(redlabel);
        bluepanel.add(bluelabel);
        greenpanel.add(greenlabel);

        redpanel.setBorder(border);
        bluepanel.setBorder(border);
        greenpanel.setBorder(border);

        greenpanel.add(button);

        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Color c1 = new Color(140, 5, 80);
        Color c2 = new Color(250, 180, 0);
        boolean buttonpressed = event.getSource() == button;
        
        i++;

        if (buttonpressed && i % 2 == 0) {
            frame.getContentPane().setBackground(c1);
        }
        else if (buttonpressed && i % 2 == 1) {
            frame.getContentPane().setBackground(c2);
        }

        if (i == 10) {
            button.setEnabled(false);
        }


    }

}
