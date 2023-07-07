import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Input {

    public static void main ( String[] args ) throws IOException {


                int number1;

                File file = new File("numeros.txt");
                Scanner scan = new Scanner(file);


    while (scan.hasNextInt()) {

        number1 = scan.nextInt();
        System.out.println(number1);

    }
    
    }
}