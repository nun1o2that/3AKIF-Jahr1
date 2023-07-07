package misc;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
* Main-Klasse
* Dient dem Starten des Spiels und der Wiederholung bei Bedarf
**/
public class WindowGlep extends JFrame{

    public WindowGlep() {

        this.setVisible(true);  // make the window visible duh
        this.setSize(420, 420); // set the size (resizable!);
        this.setTitle("Wordle game by   meeeee :)");  // text in the menubar on top
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // clicking the x CLOSES program
        this.getContentPane().setBackground(new Color(140, 5, 80)); // coler

        ImageIcon dedus = new ImageIcon("");
        this.setIconImage(dedus.getImage());    // sets the icon in the top left

        JLabel firstLabel = new JLabel();
        ImageIcon glep = new ImageIcon("");
        firstLabel.setText("GRuHGUGHHH MORTY we're in a jframe morty .");
        firstLabel.setIcon(glep);
        this.add(firstLabel);

        firstLabel.setHorizontalTextPosition(JLabel.CENTER);    // LEFT, CENTER, RIGHT of image
        firstLabel.setVerticalTextPosition(JLabel.TOP);
        firstLabel.setForeground(Color.white);
        firstLabel.setFont(new Font("Fixedsys Excelsior 3.01", Font.PLAIN, 10));
        firstLabel.setIconTextGap(50);

        firstLabel.setBackground(Color.black);
        firstLabel.setOpaque(true); // display background color

        Border firstBorder = BorderFactory.createLineBorder(Color.white, 6);
        firstLabel.setBorder(firstBorder);

        firstLabel.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        firstLabel.setHorizontalAlignment(JLabel.CENTER);

        this.setLayout(null);
        firstLabel.setBounds(0, 0, 250, 250);   // x, y, width, height

        // this.pack(); // resizes window to fit components

    }
    
}