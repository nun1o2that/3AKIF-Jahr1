package textfields;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Textfield extends JFrame implements ActionListener {
    
    JTextField textfield;
    JButton button;

    public Textfield() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(250, 40));
        textfield.setFont(new Font("Consolas", Font.ITALIC, 15));
        textfield.setForeground(new Color(230, 160, 0));
        textfield.setBackground(new Color(40, 80, 30));
        textfield.setCaretColor(new Color(230, 160, 0));    // color of line next to what you're typing
        textfield.setText("username");
        // textfield.setEditable(false)     // to disable editing of textfield

        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(textfield);    // add before pack
        this.add(button);       // add before pack
        this.pack();            // size adjusts to components
        this.setVisible(true);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + textfield.getText());
            // textfield.setEditable(false);    // lols
            // button.setEnabled(false);
        }
    }

}
