/**
* Diese Klasse dient dem Vorzeigen eines Stackoverflows mittels einer rekursiven Methode
**/
public class StackOverflow {
    
    /**
    * rekursive Methode, die zum Stackoverflow fuehrt (zu viele Stufen der Rekursion)
    * bei einer kleineren Zahl in der if-Anweisung kann die Methode zum aufzaehlen benutzt werden, wie x++.
    * @param x mitgegebene Zahl (main()-Methode)
    * @return hochgezaehlter Wert am Ende
    **/
    public static int overflow(int x) {
        if (x < 1000000) {
            /* mit Methodenaufruf wird bei jeder Rekursionsstufe der Speicher gecheckt. Ein paar Veraenderungen sind zu sehen. */
            memory();
            x = overflow(x + 1); 
        }
        return x;
    }

    /**
    * ruft Methoden der Runtime-Klasse auf, um Informationen ueber den Speicher auszugeben
    **/
    public static void memory() {
        /* in jedem Programm gibt es schon eine Instanz, deswegen die getRuntime()-Methode und nicht das new-Keyword */
        Runtime run = Runtime.getRuntime();

        System.out.println("\n" + "freeMemory(): " + run.freeMemory()); /* freier Speicher */
        System.out.println("totalMemory(): " + run.totalMemory());      /* insgesamter Speicher */
        System.out.println("maxMemory(): " + run.maxMemory());          /* maximaler Speicher, mit dem die JVM versucht, das Programm auszufuehren */
    }

    /**
    * main()-Methode
    **/
    public static void main ( String[] args ) {

        // memory();

        /* Stackoverflow */
        System.out.println("\n" + "**********" + "\n" + overflow(1) + "\n" + "**********");

        // memory();

    }

}
