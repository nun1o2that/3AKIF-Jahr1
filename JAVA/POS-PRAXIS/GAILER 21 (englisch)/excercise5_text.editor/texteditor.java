import java.util.Scanner;

public class texteditor {

    public static void main ( String[] args ) {

        //user enters lines of text
        //after each line, program echos the line to the terminal
        //program finishes when user enters a line that contains the characters  //done  
        //once program works, run, and redirect output to file

        //now try writing a small java source file by running small editor


                String input;

                Scanner scan = new Scanner(System.in);

            System.err.println("write a little java program");
            System.err.println("end with //done");
        
        do {

            input = scan.nextLine();
            System.out.println(input);

        } while( !(input.equals("//done")) );

    }
}