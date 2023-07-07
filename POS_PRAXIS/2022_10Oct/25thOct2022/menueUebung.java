import java.util.Scanner;

public class menueUebung {

    public static void main ( String[] args ) {

        //menue     
        // 1 - Eingabe          ("sie haben punkt 1 eingabe ausgewaehlt")
        // 2 - Pruefen          ("sie haben punkt 2 pruefen ausgewaehlt")
        // 3 - Ausgabe          ("sie haben punkt 3 ausgabe ausgewaehlt")
        // 4 - Ende             (aussstieg aus menue)


                int eingabe;

                Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("\n" + "-------------------------------------------");
            System.out.println("|                 Menue!                  |");
            System.out.println("-------------------------------------------");
            System.out.println("|              1 - Eingabe                |");
            System.out.println("|              2 - Pruefen                |");
            System.out.println("|              3 - Ausgabe                |");
            System.out.println("|              4 - Ende                   |");
            System.out.println("-------------------------------------------");
            System.out.print("            Wohin wollen Sie? ");
                eingabe = scanner.nextInt();

            // System.out.println("-------------------------------------------");
            System.out.println("\n" + "+++++++++++++++++++++++++++++++++++++++++++");

            if (eingabe == 1) {
                System.out.println("    Sie haben '1 - Eingabe' ausgewaehlt");
            }

            else if (eingabe == 2) {
                System.out.println("    Sie haben '2 - Pruefen' ausgewaehlt");
            }

            else if (eingabe == 3) {
                System.out.println("    Sie haben '3 - Ausgabe' ausgewaehlt");
            }

            else if (eingabe == 4) {
                System.out.println("     Sie haben '4 - Ende' ausgewaehlt.");
                System.out.println("                 Bye Bye !");
            }

            else {
                System.out.println("              Falsche Eingabe!");
            }

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++" + "\n" + "\n");
        
        } while ( eingabe != 4 );


    }
}



