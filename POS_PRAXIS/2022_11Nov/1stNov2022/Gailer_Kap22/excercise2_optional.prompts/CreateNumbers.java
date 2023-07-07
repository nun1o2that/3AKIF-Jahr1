import java.util.Scanner;
import java.util.Random;

import java.io.PrintWriter;
import java.io.IOException;

public class CreateNumbers {

    public static void main ( String[] args ) throws IOException {

        //program reads 5 integers from a file
        //computes their sum and maximum, prints values to screen
        

                int number;
                int count = 0;

                String antwort = "";

                PrintWriter write = new PrintWriter("numbers.txt");
                Random rand = new Random();
                Scanner scan = new Scanner(System.in);


        System.out.print("generieren (stop mit 'nein'");


        do {
            
            if (count == 0) {
                System.out.print("nummer generieren? ");
            }

            else {
                System.out.print("noch eine nummer generieren? ");
            }

            antwort = scan.next();

            if ( !(antwort.equals("nein")) ) {
                number = rand.nextInt(11)-5;            
                write.println(number);
                System.out.println(number);
            }
            
            count++;

        } while ( (count < 5) && !(antwort.equals("nein")) );


        write.close();

    }
}