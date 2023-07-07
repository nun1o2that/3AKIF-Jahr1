import java.util.ArrayList;
import java.util.Random;

/**
* Klasse zur Sortierung von ArrayLists mittels des Mergesort-Algorithmus.
* Mit Hilfe von https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
**/
public class Mergesort {

    static int swapCounter = 0;

    /**
    * Methode zum Zerstueckeln des Ausgangsarrays, arbeitet rekursiv
    * @param array in main()-Methode bzw. rekursivem Aufruf mitgegebene ArrayList
    * @return die resultierende sortierte ArrayList durch die Methode merge()
    **/
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {

            /* es muss nicht weiter zerstueckelt werden */
            if (array.size() == 1) {
                return array;
            }

            ArrayList<Integer> divide1 = new ArrayList<Integer>();
            ArrayList<Integer> divide2 = new ArrayList<Integer>();

            /* Fuellen der Aufteil-ArrayLists */
            for (int i = 0; i < array.size() / 2; i++) {
                divide1.add(array.get(i));
            }
            for (int i = array.size() / 2; i < array.size(); i++) {
                divide2.add(array.get(i));
            }

            /* weiteres Zerstueckeln wenn noetig */
            if (divide1.size() > 1) {
                divide1 = mergeSort(divide1);
            }
            if (divide2.size() > 1) {
                divide2 = mergeSort(divide2);
            }

            return merge(divide1, divide2);
            
    }

    /**
    * Methode zum Zusammenfuegen der Arraystuecke zu dem sortierten Endergebnis
    * @param firstArray
    * @param secondArray 
    **/
    public static ArrayList<Integer> merge(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {

        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        while (!firstArray.isEmpty() && !secondArray.isEmpty()) {
            if (firstArray.get(0) > secondArray.get(0)) {
                resultArray.add(resultArray.size(), secondArray.get(0));
                secondArray.remove(0);
                swapCounter++;
            }
            else {
                resultArray.add(resultArray.size(), firstArray.get(0));
                firstArray.remove(0);
            }
        }

        while (!firstArray.isEmpty()) {
            resultArray.add(resultArray.size(), firstArray.get(0));
            firstArray.remove(0);
        }

        while (!secondArray.isEmpty()) {
            resultArray.add(resultArray.size(), secondArray.get(0));
            secondArray.remove(0);
        }

        return resultArray;
    }

    /**
    * einfache Methode zum Ausgeben von ArrayLists mittels Lambda-Expression
    * @param array mitgegebene ArrayList
    **/
    public static void printArray(ArrayList<Integer> array) {
        array.forEach(i -> {System.out.print(i + ", ");});
        System.out.println();
    } 

    /**
    * Methode zum Befuellen des Arrays im Best-Case, also bereits aufsteigend sortiert
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static ArrayList<Integer> bestCase(int numOfElements) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numOfElements; i++) {
            array.add(i);
        }
        return array;
    }

    /**
    * Methode zum Befuellen des Arrays im Average-Case, also mit zufaellig verteilten Zahlen
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static ArrayList<Integer> avgCase(int numOfElements) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < numOfElements; i++) {
            array.add(rand.nextInt(0, 1000));
        }
        return array;
    }

    /**
    * Methode zum Befuellen des Arrays im Worst-Case, also absteigend sortiert
    * @param elemente Anzahl an Elemente in Liste
    * @return sortierte Liste mittels Methode bubbleSort()
    **/
    public static ArrayList<Integer> worstCase(int numOfElements) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = numOfElements; i >= 0; i--) {
            array.add(i);
        }
        return array;
    }

    /* main */
    public static void main ( String[] args ) {

        long startTime;
        long endTime;

        // Anzahl der Elemente in diesem Durchlauf
        int elements = 100;

        // 0 = BEST, 1 = AVG, 2 = WORST
        int cases = 2;

        ArrayList<Integer> toBeSorted = new ArrayList<Integer>();

        switch (cases) {
            case 0: toBeSorted = bestCase(elements); System.out.println("\n*** Best Case ***"); break;
            case 1: toBeSorted = avgCase(elements); System.out.println("\n*** Average Case ***"); break;
            case 2: toBeSorted = worstCase(elements); System.out.println("\n*** Worst Case ***"); break;
        }
        
        System.out.print("\nBefore sorting: ");
        printArray(toBeSorted);

        startTime = System.nanoTime();
        toBeSorted = mergeSort(toBeSorted); /* merge() gibt die sortierte ArrayList zurueck */
        endTime = System.nanoTime();

        System.out.println("Elements: " + elements);
        System.out.println("Vergleiche: " + swapCounter);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds = " + Double.valueOf(endTime-startTime) / 1000000000 + " seconds");

        System.out.print("After sorting: ");
        printArray(toBeSorted);

    }

}