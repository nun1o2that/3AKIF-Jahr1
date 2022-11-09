import java.util.Scanner;

public class HelloWorld {

    public static void main( String[] args ) {

        //program writes ten x's to screen
        //use file redirection to send program's output to a text file
        //use DIR command to see how many bites are in file
        //depending on OS, might see more than 10 bytes

        //two additional bytes: control characters that indicate end of the line
        //windows: CARRIAGE RETURN & LINE FEED


                Scanner scan = new Scanner(System.in);
                int amount;

            
        System.err.print("how many x's you wanna print my guy ");
            amount = scan.nextInt();
        // System.out.print("how many x's you wanna print my guy ");

        while (amount > 0) {
            System.out.println("x");
            amount--;
        } 

        // for (amount = scan.nextInt(); amount > 0; amount--) {
        //     System.out.println("x");
        // }
    
    }
}