import java.util.Random;

import java.io.PrintWriter;
import java.io.IOException;

public class createnumbers {

    public static void main ( String[] args ) throws IOException {

        //program reads 5 integers from a file
        //computes their sum and maximum, prints values to screen
        

                int number;
                int count = 0;

                PrintWriter write = new PrintWriter("numbers.txt");
                Random rand = new Random();


        do {

            number = rand.nextInt(11)-5;
                
            write.println(number);

            count++;

        } while (count < 5);



        write.close();

    }
}