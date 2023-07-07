import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Funktional {

    public static void main (String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        long filterCounter = 0;
            
        filterCounter = myList
            .stream()                           // in Stream verwandeln
            .filter(s -> s.startsWith("c"))     // nur Elemente die mit "c" beginnen speichern
            .map(String::toUpperCase)           // in Uppercase verwandeln
            .sorted()                           // aufsteigend sortieren
            .count();                           // zaehlt Elemente im Stream

        System.out.println("Filter dann Map: " + filterCounter);    // "c"-Elemente ausgewaehlt, dann in Uppercase verwandelt
        // System.out.println("Map dann Filter: " + filterCounter); // in Uppercase und dann nach "c" gesucht (jetzt sind alle Uppercase, also keine Uebereinstimmungen!)

    }

}