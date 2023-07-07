import java.util.Scanner;

public class Aufgabe5_y2k{

    public static void main ( String[] args ){

        //y2k problem detektor

        //programm fragt anwender nach geburtsjahr, in zwei ziffern ( "62" ) 
        //programm fragt nach aktuellen jahr, also in zwei zifferm  (  "04" )

        //programm soll richtiges alter des anwenders in jahren ausgeben



                int geburtsjahr;
                int aktuellesJahr;

                int alter;
                int alterKorrektur;

                Scanner myScanner = new Scanner(System.in);


        System.out.println("---------------------------------------");
        System.out.println("        Y2K-Problem-Detektor");
        System.out.println("---------------------------------------");

        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Benutzen Sie bei der Eingabe");
        System.out.println("jeweils die letzten 2 Ziffern!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.print("\n" + "Geben Sie Ihr Geburtsjahr ein: ");
            geburtsjahr = myScanner.nextInt();

        System.out.print("Was ist das aktuelle Jahr>? ");
             aktuellesJahr = myScanner.nextInt();


        alter = aktuellesJahr - geburtsjahr;


        if(aktuellesJahr < geburtsjahr){
            alter = (aktuellesJahr - geburtsjahr) + 100;
            System.out.println("\n" + "     Sie sind " + alter + " Jahre alt.");
        }

        else{
            System.out.println("\n" + "     Sie sind " + alter + " Jahre alt.");
        }

    }
}