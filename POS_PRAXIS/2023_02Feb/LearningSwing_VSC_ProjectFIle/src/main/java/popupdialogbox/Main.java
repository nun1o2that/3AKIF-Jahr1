package popupdialogbox;
import javax.swing.*;

public class Main {
    
    public static void main ( String[] args ) {

        // joptionpane - pop up a standard dialog box that prompts users for a value or informs them of something

        // (parentComponent, message, title, messageType)
        // JOptionPane.showMessageDialog(null, "This is Plain.", "Title", JOptionPane.PLAIN_MESSAGE);
        
        // JOptionPane.showMessageDialog(null, "This is some useless info.", "Title", JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is a question.", "Title", JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is a warning.", "Title", JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "This is an error.", "Title", JOptionPane.ERROR_MESSAGE);

        // put them in while loop is possible, cant close it ever lol


        // JOptionPane.showConfirmDialog(null, "This will delete all unsaved Progress. Continue?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        // YES returns 0
        // NO returns 1
        // CANCEL returns 2
        // X-BUTTON returns -1
        // e.g save answer in an integer variable


        // String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println(name);


        String[] responses = {"Yes", "No", "Fack You"};
        ImageIcon gnome = new ImageIcon("");

        // (parentComponent, message, title, optionType, messageType, icon, options, initialValue)
        int answer = JOptionPane.showOptionDialog(null,                              // parentComponent
                                    "Your Gnome is getting hungry very. Feed him berries or else he will despawn.", // message
                                    "ALERT!",                           // title
                                    JOptionPane.YES_NO_CANCEL_OPTION,   // optionType
                                    JOptionPane.INFORMATION_MESSAGE,    // messageType
                                    gnome,                              // icon    (null - uses default icon for that message type; ImageIcon)
                                    responses,                          // options (null, or string array)
                                    0                                   // initialValue (initial button that is "selected")
        );

        if (answer == 0) {
            JOptionPane.showMessageDialog(null, "HA HE", "The challenge fail", JOptionPane.WARNING_MESSAGE);
        }

    }

}
