import java.util.Scanner;

public class a1_quadratUndKubikzahlen {

    public static void main ( String[] args ) {

        //einen integer n per scanner eingabae
        //ausgabe: addition von jeweils quadrat- und kubikzahlen von 1 bis n
        //nur eine schleife


                int n;
                int quadratSumme = 0;
                int kubikSumme = 0;

                int counter;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "-------------------------------------------------");
        System.out.println("      Addition von Quadrat- und Kubikzahlen");
        System.out.println("-------------------------------------------------");

        System.out.print("\n" + "n eingeben: ");
            n = eingabe.nextInt();


                while (n > 0) {
                    quadratSumme = quadratSumme + (int)(Math.pow(n, 2));
                    kubikSumme = kubikSumme + (int)(Math.pow(n, 3));
                    n--;
                }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Quadratsumme: " + quadratSumme);
        System.out.println("Kubiksumme: " + kubikSumme);
    }

}