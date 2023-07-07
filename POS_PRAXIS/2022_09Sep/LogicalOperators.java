public class LogicalOperators{

    public static void main ( String[] args ){

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("  c ERGIBT " + c);
        System.out.println(" !c ERGIBT " + !c);
        System.out.println("!!c ERGIBT " + !!c);

        System.out.println("\n" + "a&b ERGIBT " + (a&b));
        System.out.println("a&c ERGIBT " + (a&c));
        System.out.println("a&&b ERGIBT " + (a&&b));
        System.out.println("a&&c ERGIBT " + (a&&c));

        System.out.println("\n" + "Laut Recherche: & erlaubt KEINE Short-Circuit-Auswertung, && SCHON");
        
    }
}