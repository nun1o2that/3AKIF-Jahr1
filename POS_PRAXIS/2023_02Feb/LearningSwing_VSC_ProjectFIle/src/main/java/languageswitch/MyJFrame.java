package languageswitch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrame implements ActionListener {
    
    String language;
    int continueOrNot;

    JFrame frame;
    JButton englishButton;
    JButton germanButton;
    JLabel label;

    public MyJFrame() {
        
        initializeLanguage();
        
        if (continueOrNot == 0) {
            JOptionPane.showMessageDialog(null, "FACK YOU", "No game for you", JOptionPane.ERROR_MESSAGE);
        }

        else {
            englishButton = new JButton();
            englishButton.setFocusable(false);
            englishButton.setIcon(new ImageIcon(""));
            englishButton.setBounds(10, 10, 150, 50);
            englishButton.addActionListener(this);

            germanButton = new JButton();
            germanButton.setFocusable(false);
            germanButton.setIcon(new ImageIcon(""));
            germanButton.setBounds(10, 70, 150, 50);
            germanButton.addActionListener(this);

            label = new JLabel();
            label.setOpaque(true);
            label.setBounds(10, 130, 150, 50);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
            label.setBackground(Color.black);
            label.setForeground(Color.white);
            labelTextChange();

            frame = new JFrame();
            frame.setSize(420, 420);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(new Color(255, 180, 0));   
            frame.setLayout(null);
            frame.add(englishButton);
            frame.add(germanButton);
            frame.add(label);
            frame.setVisible(true);
        }

    }
    
    public void initializeLanguage() {
        ImageIcon icon = new ImageIcon("");
        String[] responses = {"English", "German"};
        int answer;

        answer = JOptionPane.showOptionDialog(null, "Select your language / Waehlen Sie Ihre Sprache.", "Language selection / Sprachauswahl", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, null);
        System.out.println(answer);

        if (answer == 0) {
            language = "English";
            continueOrNot = 1;
        }
        else if (answer == 1) {
            language = "German";
            continueOrNot = 1;
        }
        else {
            continueOrNot = 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == englishButton) {
            if (language.equals("English")) {
                JOptionPane.showMessageDialog(null, "The game is already in English!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else {
                changeLanguage("English");
            }
        }

        else if (e.getSource() == germanButton) {
            if (language.equals("German")) {
                JOptionPane.showMessageDialog(null, "Das Spiel ist schon in Deutsch!", "Warnung", JOptionPane.WARNING_MESSAGE);
            }
            else {
                changeLanguage("German");
            }
        }

    }

    public void changeLanguage(String switchTo) {
        String text = "";
        String[] responses = {"", ""};
        String title = "";
        int answer;
        ImageIcon icon = new ImageIcon("");

        if (language.equals("English")) {
            text = "Changing the language will cause the game to reset. Continue?";
            responses[0] = "Yes"; responses[1] = "No";
            title = "Warning";
        }
        else if (language.equals("German")) {
            text = "Durch den Sprachenwechsel wird das Spiel zurueckgesetzt. Fortfahren?";
            responses[0] = "Ja"; responses[1] = "Nein";
            title = "Warnung";
        }

        answer = JOptionPane.showOptionDialog(null, text, title, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, icon, responses, null);
        System.out.println(answer);


        title = "Information";

        if (answer == 0) {
            language = switchTo;
            labelTextChange();

            if (language.equals("English")) {
                text = "Language has been changed.";
            }
            else if (language.equals("German")) {
                text = "Sprache wurde geaendert.";
            }
        }
        else {
            if (language.equals("English")) {
                text = "Language was not changed.";
            }
            else if (language.equals("German")) {
                text = "Sprache wurde nicht geaendert.";
            }
        }

        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);

    }

    public void labelTextChange() {
        if (language.equals("English")) {
            label.setText("Game in English");
        }
        else if (language.equals("German")) {
            label.setText("Spiel in Deutsch");
        }
    }

}
