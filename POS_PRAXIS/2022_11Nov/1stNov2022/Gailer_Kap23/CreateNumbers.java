import java.util.Random;

import java.io.PrintWriter;
import java.io.IOException;

public class CreateNumbers {

    public static void main ( String[] args ) throws IOException {

        //program reads 5 integers from a file
        //computes their sum and maximum, prints values to screen
        

                int number;
                int count = 0;

                Random rand = new Random();


        do {

            number = rand.nextInt(10)+1;
                
            System.err.println(number);
            System.out.println(number);

            count++;

        } while (count < 10);


    }
}