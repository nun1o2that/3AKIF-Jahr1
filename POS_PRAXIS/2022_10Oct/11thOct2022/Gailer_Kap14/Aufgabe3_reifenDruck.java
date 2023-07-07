import java.util.Scanner;

public class Aufgabe3_reifenDruck {

    public static void main ( String[] args ) {

        //beide vorderreifen eines autos sollen gleichen reifendruck haben
        //beide hinterreifen sollen gleichen reifendruck haben, aber nicht unbedingt den gleichen wie die vorderreifen

        // programm fragt nach reifendruck der 4 raeder (in pounds per square inch = psi) und gibt ein ob der reifendruck in ordnung ist

                double linkerVorderreifen;
                double rechterVorderreifen;
                double linkerHinterreifen;
                double rechterHinterreifen;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("        Reifendruck-Checker");
        System.out.println("------------------------------------");

        System.out.print("\n" + "linker Vorderreifen: ");
                linkerVorderreifen = eingabe.nextDouble();
        System.out.print("rechter Vorderreifen: ");
                rechterVorderreifen = eingabe.nextDouble();

        System.out.print("\n" +  "linker Hinterreifen: ");
                linkerHinterreifen = eingabe.nextDouble();
        System.out.print("rechter Hinterreifen: ");
                rechterHinterreifen = eingabe.nextDouble();

        
        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (linkerVorderreifen == rechterVorderreifen && linkerHinterreifen == rechterHinterreifen) {
            System.out.println("Reifendruck ist in Ordnung!");
        }

        else {
            System.out.println("Reifendruck ist falsch!");
        }

        
    }
}