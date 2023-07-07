import java.util.Scanner;

public class Sterne {

    public static void main ( String[] args ) {


                int sterne;
                int zaehler;

                Scanner scan = new Scanner(System.in);


        System.out.print("wie viele sterne? ");
            sterne = scan.nextInt();

        System.out.println();

        
        do {

            zaehler = sterne;

            while (zaehler > 0) {
                System.out.print("*");
                zaehler--;
            }

            sterne--;
            System.out.println();

        } while (sterne > 0);


    }
}
