import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.*;

public class MonateMap {

    HashMap<String, Integer> monMap;

    public MonateMap() {
        monMap = new HashMap<String, Integer>();
        
        monMap.put("Januar", 31);
        monMap.put("Februar", 28);
        monMap.put("Maerz", 31);
        monMap.put("April", 30);
        monMap.put("Mai", 31);
        monMap.put("Juni", 30);
        monMap.put("Juli", 31);
        monMap.put("August", 31);
        monMap.put("September", 30);
        monMap.put("Oktober", 31);
        monMap.put("November", 30);
        monMap.put("Dezember", 31);
    }

    public void ausgabe_tageEinesMonats() {
        Scanner scan = new Scanner(System.in);
        String user = "";

        do {
            System.out.print("Tagesanzahl welchen Monats ausgeben? (Grossschreibung beachten!): ");
            user = scan.next();

        } while( !Pattern.matches("Januar|Februar|Maerz|April|Mai|Juni|Juli|August|September|Oktober|November|Dezember", user) );

        System.out.println("\n" + "Der Monat " + user + " hat " + monMap.get(user) + " Tage.");
        // hier kein scan.close(), weil sonst der scanner in der main-methode eine NoSuchElementException wirft.
    }

    public void ausgabe_ALLE() {
        for (String i : monMap.keySet()) {
            System.out.println(i + ": " + monMap.get(i) + " Tage");
        }
    }

    public void summeUndDurchschnitt() {
        int summe = 0;
        double durchschnitt = 0.0;

        for (String i : monMap.keySet()) {
            summe += monMap.get(i);
        }

        durchschnitt = summe / monMap.size();

        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
    }

}