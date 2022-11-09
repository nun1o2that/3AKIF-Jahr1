// import java.util.Scanner;

// public class aufgabe5_test {

//     public static void main ( String[] args ) {

        
//             double linkerVorderreifen;
//             double rechterVorderreifen;

//             Scanner eingabe = new Scanner(System.in);

//     System.out.print("linker eingabe"); linkerVorderreifen = eingabe.nextDouble();
//     System.out.print("rechter eingabe"); rechterVorderreifen = eingabe.nextDouble();

    //     if  ( !((linkerVorderreifen < rechterVorderreifen + 3) && (linkerVorderreifen > rechterVorderreifen - 3)) ) {
    //         System.out.println("bah");
    //     }

//     }
// }



import java.util.Scanner;

public class aufgabe5_test {

    public static void main ( String[] args ) {

        //beide vorderreifen eines autos sollen gleichen reifendruck haben
        //beide hinterreifen sollen gleichen reifendruck haben, aber nicht unbedingt den gleichen wie die vorderreifen

        // programm fragt nach reifendruck der 4 raeder (in pounds per square inch = psi) und gibt ein ob der reifendruck in ordnung ist

        //ZUSATZ: jeder reifen muss sich im bereich zwischen 35 und 45 befinden
        //SOFORT nach eingabe WARNMELDUNG

                double linkerVorderreifen;
                double rechterVorderreifen;
                double linkerHinterreifen;
                double rechterHinterreifen;

                boolean druckOK = true;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("        Reifendruck-Checker");
        System.out.println("------------------------------------------------------------------");

        System.out.print("\n" + "linker Vorderreifen: ");
                linkerVorderreifen = eingabe.nextDouble();

                    if (linkerVorderreifen < 35 || linkerVorderreifen > 45) {
                        System.out.println("Achtung: Reifendruck ist ausserhalb des erlaubten Bereichs!");
                        druckOK = false;
                    }

        System.out.print("rechter Vorderreifen: ");
                rechterVorderreifen = eingabe.nextDouble();

                    if (rechterVorderreifen < 35 || rechterVorderreifen > 45) {
                        System.out.println("Achtung: Reifendruck ist ausserhalb des erlaubten Bereichs!");
                        druckOK = false;
                    }

        System.out.print("\n" +  "linker Hinterreifen: ");
                linkerHinterreifen = eingabe.nextDouble();

                    if (linkerHinterreifen < 35 || linkerHinterreifen > 45) {
                        System.out.println("Achtung: Reifendruck ist ausserhalb des erlaubten Bereichs!");
                        druckOK = false;
                    }

        System.out.print("rechter Hinterreifen: ");
                rechterHinterreifen = eingabe.nextDouble();

                    if (rechterHinterreifen < 35 || rechterHinterreifen > 45) {
                        System.out.println("Achtung: Reifendruck ist ausserhalb des erlaubten Bereichs!");
                        druckOK = false;
                    }

        
        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    

        if ( ((linkerVorderreifen <= rechterVorderreifen + 3) && (linkerVorderreifen >= rechterVorderreifen - 3)) && ((linkerHinterreifen <= rechterHinterreifen + 3) && (linkerHinterreifen >= rechterHinterreifen - 3)) && (druckOK == true) )  {
            System.out.println("Reifendruck ist in Ordnung!");
        }

        else {
            System.out.println("Reifendruck ist nicht in Ordnung!");
        }

    }
}