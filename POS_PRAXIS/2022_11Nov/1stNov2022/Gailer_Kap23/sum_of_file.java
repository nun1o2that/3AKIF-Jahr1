import java.util.Scanner;
import java.io.*;

public class sum_of_file {

    public static void main ( String[]args ) throws IOException {


        //program adds all integers of a file consisting of integers
        //prompt user for file name


                int number;
                int sum = 0;

                String fileName;

                Scanner userInput = new Scanner(System.in);

        
        System.out.print("enter a filename (ranging from 1.txt to (including) 5.txt : ");
            fileName = userInput.next().trim();


                File fil = new File(fileName);
                Scanner fileInput = new Scanner(fil);


        while ( fileInput.hasNextInt() ) {

            number = fileInput.nextInt();
            System.out.println("+" + number);
    
            sum += number;

        }

        System.out.println("\n" + "sum of " + fileName + " : " + sum);

        userInput.close();
        fileInput.close();

    }
}