import java.util.Scanner;

public class a3_keilVonSternen {

    public static void main ( String[] args ) {

        //programm gibt sterne in keilform aus
        //anwender gibt anfangszahl fuer die sterne ein
        //programm gibt zeilen von sternen aus
        //jede zeile hat einen stern weniger als die vorhergehende


                int sternAnzahl;
                int counter;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "--------------------------------------------");
        System.out.println("+ * + * + * + Keil von Sternen + * + * + * +");
        System.out.println("--------------------------------------------");

        System.out.print("\n" + "Anfangszahl der Sterne: ");
            sternAnzahl = eingabe.nextInt();
        System.out.println("");

                while (0 < sternAnzahl) {

                    counter = sternAnzahl;

                    while (0 < counter) {
                        System.out.print("*");
                        counter--;
                    }

                    sternAnzahl--;
                    System.out.println("");

                }
    }

}