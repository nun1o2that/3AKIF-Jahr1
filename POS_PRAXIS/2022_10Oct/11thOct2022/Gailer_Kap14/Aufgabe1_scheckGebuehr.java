import java.util.Scanner;

public class Aufgabe1_scheckGebuehr {

    public static void main ( String[] args ) {

        //wenn ein kunde auf seinem girokonto ein guthaben von mehr als $1000 oder auf seinem sparkonto ein guthaben von mehr als $1500 hat, wird keine scheckgebuehr erhoben

        //andernfalls gebuehr von $0.15

        //programm fragt nach kontostand der beiden konten und gibt dann aus, ob eine gebuehr erhoben wird oder nicht

                double girokonto;
                double sparkonto;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "--------------------------------------------------------");
        System.out.println("                    Scheckgebuehr");
        System.out.println("--------------------------------------------------------");

        System.out.print("\n" + "Geben Sie ihren Girokonto-Stand ein: "); 
            girokonto = eingabe.nextDouble();

        System.out.print("Geben Sie ihren Sparkonto-Stand ein: ");
            sparkonto = eingabe.nextDouble();


        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (girokonto > 1000 || sparkonto > 1500) {
            System.out.println("Ihnen wird eine Gebuehr von $0.15 verschrieben.");
        }

        else {
            System.out.println("Ihnen wird keine Gebuehr verschrieben.");
        }


    }
}