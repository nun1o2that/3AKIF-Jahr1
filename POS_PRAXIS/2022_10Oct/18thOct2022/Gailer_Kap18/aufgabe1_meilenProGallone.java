import java.util.Scanner;

public class aufgabe1_meilenProGallone {

    public static void main ( String[] args ) {

        //benutzer gibt anfangs- & endstand der gefahrenen meilen, und die gallonen ein
        //gefahrene meilen durch gallonen -> programm gibt meilen pro gallone aus


                int anfang;
                int ende;               //eingabewerte
                int gallonen;

                int gefahreneMeilen;    //zu berechnende werte
                double m_pro_g;

                Scanner eingabe = new Scanner(System.in);

        
        System.out.println("\n" + "---------------------------------------------------------");
        System.out.println("                   Meilen pro Gallonen");
        System.out.println("---------------------------------------------------------" + "\n");


        System.out.print("Anfangsstand Meilen (negative Zahlen bedeuten Programmende): ");
            anfang = eingabe.nextInt();



            while (anfang >= 0) {

                    System.out.print("Endstand Meilen: ");
                        ende = eingabe.nextInt();
                                                                    //eingabe endstand und gallonen
                    System.out.print("Gallonen: ");
                        gallonen = eingabe.nextInt();

                    
                    gefahreneMeilen = ende - anfang;                //berechnung der gefahrenen meilen
                    m_pro_g = 1.0 * gefahreneMeilen / gallonen;     //meilen pro gallone


                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Meilen pro Gallone: " + m_pro_g);

                    System.out.println("\n" + "---------------------------------------------------------");
                    System.out.print("Anfangsstand Meilen (negative Zahlen bedeuten Programmende): ");
                        anfang = eingabe.nextInt();                 //eingabe anfangsstand

            }


        System.out.println("\n" + "---------------------------------------------------------");
        System.out.println("byebye!");

    }
}