import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

/**
* Klasse zur Sortierung von Arrays mittels des BubbleSort-Algorithmus
**/
public class Bubblesort {

    /**
    * Methode die den Bubblesort-Algorithmus ausfuehrt
    * @param array zu sortierendes Array
    * @return ein Array von zwei Elementen: das Erste die Anzahl an Swaps, das zweite die benoetigte Zeit fuer das Sortieren in diesem Durchlauf
    **/
    public static BigInteger[] bubbleSort(int[] array) {

        int temp = 0;
        BigInteger swapCounter = BigInteger.valueOf(0);
        BigInteger adder = BigInteger.valueOf(1);
        boolean remainingSwaps;

        long startZeit = System.nanoTime();
        long endZeit = 0;

        for (int i = array.length; i > 1; i--) {
            remainingSwaps = false;
            for (int z = 0; z < i - 1; z++) {
                if (array[z] > array[z + 1]) {
                    temp = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = temp;

                    swapCounter = swapCounter.add(adder);
                    remainingSwaps = true;
                }
            }
            if (!remainingSwaps) {
                break;
            }
        }
        endZeit = System.nanoTime();
        return new BigInteger[] {swapCounter, BigInteger.valueOf(endZeit - startZeit)};
    }

    /**
    * Methode zum Befuellen des Arrays im Best-Case, also bereits aufsteigend sortiert
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static BigInteger[] bestCase(int elemente) {
        int[] best = new int[elemente];
        for (int i = 0; i < best.length; i++) {
            best[i] = i;
        }
        return bubbleSort(best);
    }

   /**
    * Methode zum Befuellen des Arrays im Average-Case, also mit zufaellig verteilten Zahlen
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static BigInteger[] avgCase(int elemente) {
        int[] avg = new int[elemente];
        Random rand = new Random();
        for (int i = 0; i < avg.length; i++) {
            avg[i] = rand.nextInt();
        }
        return bubbleSort(avg);
    }

    /**
    * Methode zum Befuellen des Arrays im Worst-Case, also absteigend sortiert
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static BigInteger[] worstCase(int elemente) {
        int[] worst = new int[elemente];
        int counter = elemente;
        for (int i = 0; i < worst.length; i++) {
            worst[i] = counter;
            counter--;
        }
        return bubbleSort(worst);
    }

    /**
    * einfache Methode zum Ausgeben der Ergebnisse
    * @param mw_schritte Mittelwert der getaetigten Swaps
    * @param mw_zeit Mittelwert der benoetigten Zeit
    * @param elemente Anzahl an Elemente in sortierter Liste
    **/
    public static void ausgabe(Double mw_schritte, Double mw_zeit, int elemente) {
        System.out.println("\n----- " + elemente + " Elemente -----");
        System.out.println("Mittelwert Schritte: " + mw_schritte + " Swaps");
        System.out.println("Mittelwert Zeit: " + mw_zeit + " Nanosekunden");
    }

    /* main */
    public static void main ( String[] args ) {

        BigInteger Insg_Schritte = BigInteger.valueOf(0);
        BigInteger Insg_Zeit = BigInteger.valueOf(0);
        BigInteger[] rueckgaben = new BigInteger[2];

        Double MW_Schritte = 0.0;
        Double MW_Zeit = 0.0;

        // anzahl der Elemente in diesem Durchlauf
        int elemente = 100000;

        // 0 = BEST, 1 = AVG, 2 = WORST
        int whichCase = 1;

        for (int x = 0; x < 1000; x++) {
            switch(whichCase) {
                case 0: rueckgaben = bestCase(elemente); break;
                case 1: rueckgaben = avgCase(elemente); break;
                case 2: rueckgaben = worstCase(elemente); break;
            }
            Insg_Schritte = Insg_Schritte.add(rueckgaben[0]);
            Insg_Zeit = Insg_Zeit.add(rueckgaben[1]);
        }

        MW_Schritte = Insg_Schritte.doubleValue() / 1000;
        MW_Zeit = Insg_Zeit.doubleValue() / 1000;

        switch(whichCase) {
            case 0: System.out.println("\n********** BEST CASE **********"); break;
            case 1: System.out.println("\n********** AVERAGE CASE **********"); break;
            case 2: System.out.println("\n********** WORST CASE **********"); break;
        }

        ausgabe(MW_Schritte, MW_Zeit, elemente);

    }

}