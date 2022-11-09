import java.util.Scanner;

public class HelloWorld2 {

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
        System.out.print("how many x's you wanna print my guy ");
        System.out.println(amount);

        while (amount > 0) {
            System.out.print("x");
            amount--;
        } 

        // System.out.print("how many x's you wanna print my guy ");


        // for (amount = scan.nextInt(); amount > 0; amount--) {
        //     System.out.print("x");
        // }
    
    }
}