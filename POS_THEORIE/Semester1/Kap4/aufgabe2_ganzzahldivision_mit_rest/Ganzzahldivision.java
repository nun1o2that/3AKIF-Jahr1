import java.util.Scanner;

public class Ganzzahldivision {

    public static void main ( String[] args ) {

        
                int x_Dividend;
                int y_Divisor;

                int q_Quotient = 0;
                int r_Rest;

                Scanner eingabe = new Scanner(System.in);


        System.out.print("\n" + "Geben Sie den Dividend ein: ");
            x_Dividend = eingabe.nextInt();

        System.out.print("Geben Sie den Divisor ein: ");
            y_Divisor = eingabe.nextInt();


                while (x_Dividend >= y_Divisor) {
                    q_Quotient = q_Quotient + 1;          
                    x_Dividend = x_Dividend - y_Divisor;  
                }


        r_Rest = x_Dividend;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Quotient: " + q_Quotient);
        System.out.println("Rest: " + r_Rest);
    }
}