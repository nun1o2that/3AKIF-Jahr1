import java.util.Scanner;

public class EuklidischerAlgorithmus {

    public static void main ( String[] args ) {

        //zur berechnung des groessten gemeinsamen teilers

                int a;
                int b;
    
                Scanner eingabe = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("       Euklidischer Algorithmus");
        System.out.println("-----------------------------------------");


        System.out.print("\n" + "1. Zahl eingeben: ");
            a = eingabe.nextInt();
        System.out.print("2. Zahl eingeben: ");
            b = eingabe.nextInt();


                while (b != 0) {

                    if (a > b) {
                        a = a - b;      
                    } 

                    else {
                        b = b - a;
                    }

                }
        

        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Der groesste gemeinsame Teiler betraegt: " + a);
    }
}