import java.util.Scanner;

public class aufgabe4_nonFettKalkulator{

    public static void main ( String[] args ){

        //programm fragt anwender nach:

        //preis pro pfund der packung "A"
            //prozentanteil an mageren (nicht-fetten) fleisch in packung "A"
        //preis pro pfund der packung "B"
            //prozentanteil an mageren (nicht-fetten) fleisch in packung "B"


                    double preisPackung_A;
                        int prozentanteilNichtFettesFleisch_A;

                    double preisPackung_B;
                        int prozentanteilNichtFettesFleisch_B;
                    
                    double nichtFettPreis_A;
                    double nichtFettPreis_B;

                    Scanner myScanner = new Scanner(System.in);



        System.out.println("------------------------------");
        System.out.println("      Non-Fett-Kalkulator");
        System.out.println("------------------------------" + "\n");


        System.out.print("Preis pro Pfund für Packung A: ");
            preisPackung_A = myScanner.nextDouble();

        System.out.print("Prozent mageres Fleisch Packung A (ganz=100, nicht=0): ");
            prozentanteilNichtFettesFleisch_A = myScanner.nextInt();

         System.out.print("Preis pro Pfund für Packung B: ");
            preisPackung_B = myScanner.nextDouble();

        System.out.print("Prozent mageres Fleisch Packung B (ganz=100, nicht=0): ");
            prozentanteilNichtFettesFleisch_B = myScanner.nextInt();
        





        nichtFettPreis_A = ((preisPackung_A / prozentanteilNichtFettesFleisch_A) * 100);
        nichtFettPreis_B = ((preisPackung_B / prozentanteilNichtFettesFleisch_B) * 100);


        System.out.println("\n" + "     Packung A kostet pro Pfund mageres Fleisch: " + nichtFettPreis_A);
        System.out.println("     Packung B kostet pro Pfund mageres Fleisch: " + nichtFettPreis_B);



                if(nichtFettPreis_A < nichtFettPreis_B){
                    System.out.println("\n" + "     --> Packung A ist preiswerter.");
                }

                else if(nichtFettPreis_A > nichtFettPreis_B){
                    System.out.println("\n" + "     --> Packung B ist preiswerter.");
                }

                else{
                    System.out.println("\n" + "     --> Packung A und Packung B kosten gleich viel.");
                }




    }
}