import java.util.Scanner;

public class Aufgabe2_ziegelstein {

    public static void main ( String[] args ){

        //ziegelstein vom turn fallen
        //entfernung e = (1/2)Gz^2

        //G ist konstante der erdbeschleuning 9.81
        //z ist zeit in sekunden
        //e ist zurückgelegte entfernung in meter       

        //programm fragt anwender nach anzahl der sekunden fragt und zurückgelegte entfernung ausgibt

        double G = 9.81;
        double z;
        double e;
        Scanner myScanner = new Scanner(System.in);


        // System.out.println(Math.pow(3, 4)); //---> 3 hoch 4

        System.out.println("----------------------------------------------------------");
        System.out.println("                  Fallender Ziegelstein");
        System.out.println("----------------------------------------------------------");

        System.out.print("\n" + "Geben sie ihre Sekundenzahl an: ");
            z = myScanner.nextDouble();

        
        e = (1.0/2) * 9.81 * (Math.pow(z, 2));

        System.out.println("\n" + "     Die zurückgelegte Entfernung beträgt " + e + " Meter.");
         System.out.println("\n" + "----------------------------------------------------------");
    }
}