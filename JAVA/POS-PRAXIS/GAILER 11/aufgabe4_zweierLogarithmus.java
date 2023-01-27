import java.util.Scanner;

public class aufgabe4_zweierLogarithmus{

    public static void main ( String[] args ) {

        //http://www.gailer-net.de/tutorials/java/Notes/chap11/progExercises11.html

        //zweier-logarithmus -   log2 X = (loge X) / (loge 2)
        //                       loge  -->  Math.log( X )


                    Scanner keyboardScanner = new Scanner(System.in);
                    double eingabe;
                    double zweierLogarithmus;

        System.out.println("-------------------------------------------------");
        System.out.println("               Zweier-Logarithmus");
        System.out.println("-------------------------------------------------");

        System.out.print("\n" + "Geben Sie Ihren Double ein (mit Komma!): ");
            eingabe = keyboardScanner.nextDouble();

        zweierLogarithmus = (Math.log(eingabe)) / (Math.log( 2 ));


        System.out.println("\n" + "     --> Der Zweierlogarithmus von " + eingabe + " ist " + zweierLogarithmus);

        System.out.println("-------------------------------------------------");
    }
}