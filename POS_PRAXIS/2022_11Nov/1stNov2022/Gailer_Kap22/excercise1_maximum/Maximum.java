import java.io.File;

import java.util.Scanner;
import java.io.IOException;

public class Maximum {

    public static void main ( String[] args ) throws IOException {

        //program reads 5 integers from a file
        //computes their sum and maximum, prints values to screen
        

                // int number2; //was gonna do this w 2 int variables at first but it creates a runtime error bc of uneven numberes n shit yknow

                int number;
                int sum = 0;
                int max = 0; 

                boolean boolboolbool = true;

                File fileObject = new File("numbers.txt");

                Scanner scan = new Scanner(fileObject);
                // Scanner scan = new Scanner(System.in);



        while (scan.hasNextInt()){

            number = scan.nextInt();
            
            if (boolboolbool == true) {
                max = number;
                boolboolbool = false;
            }

            if (number > max) {
                max = number;
            }

            sum += number;

        }

        System.out.println("sum " + sum);
        System.out.println("max " + max);

        scan.close();
    }
}