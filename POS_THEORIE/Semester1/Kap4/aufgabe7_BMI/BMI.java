import java.util.Scanner;

public class BMI {

    public static void main ( String[] args ) {

        //eingabe: gewicht in kg, koerpergroesse in cm
        //ausgabe: BMI und kommentar

        //BMI = gewicht (in kg)   /   koerperggroesse^2 (in m)

        //BMI < 19 untergewicht
        //25 - 30  uebergewicht
        //30 - ... adipositas  
        //sonst    normalgewicht


                double gewicht;
                double koerperGroesse;
                double BMI;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("\n" + "---------------------------");
        System.out.println("      Body-Mass-Index");
        System.out.println("---------------------------");


        System.out.print("\n" + "Gewicht (in kg) eingeben : ");
            gewicht = eingabe.nextDouble(); //in kg

        System.out.print("Koerpergroesse (in cm) eingeben: ");
            koerperGroesse = eingabe.nextDouble(); //in cm



        koerperGroesse = koerperGroesse / 100; //in m umwandeln

        BMI = gewicht / (Math.pow(koerperGroesse, 2));

        
        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~");


                if (BMI <= 19) {
                    System.out.println("Ihr BMI ist: " + BMI);
                    System.out.println("Kommentar: Untergewicht");
                }

                else if ( (BMI > 25) && (BMI <= 30) ) {
                    System.out.println("Ihr BMI ist: " + BMI);
                    System.out.println("Kommentar: Uebergewicht");
                }

                else if (BMI > 30) {
                    System.out.println("Ihr BMI ist: " + BMI);
                    System.out.println("Kommentar: Adipositas");
                }

                else {
                    System.out.println("Ihr BMI ist: " + BMI);
                    System.out.println("Kommentar: Normalgewicht");
                }

    }
}