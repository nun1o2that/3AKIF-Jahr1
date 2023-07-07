import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import java.util.ArrayList;

public class FunctionKeyword {

    public static void main (String[] args) {
        
        // 1. Double: Parameter; 2. Double: Rueckgabetyp
        Function<Double, Double> twoTimesDouble = y -> y + y;

        // Parameter-Typ und Rueckgabetyp sind ident
        UnaryOperator<Double> doubleSquareRoot = y -> Math.sqrt(y);

        // Parameter-Typ und Rueckgabetyp sind ident
        BinaryOperator<Double> sumDoubles = (y, z) -> y + z;

        ArrayList<Double> results = new ArrayList<Double>();
        results.add(4.5);
        results.add(40.5);
        results.add(32.0);

        System.out.println();

        results
            .stream()
            .map(twoTimesDouble)    // zuerst verdoppelt -> Werte 9.0, 81.0, 64.0
            .map(doubleSquareRoot)  // dann Wurzel ziehen -> Werte 3.0, 9.0, 8.0
            // .map(sumDoubles) -> BinaryOperator kann hier nicht verwendet werden
            .forEach(System.out::println);  // jedes Element des Streams ausgeben

        Double reduce = results
            .stream()
            .map(twoTimesDouble)        // zuerst verdoppelt -> Werte 9.0, 81.0, 64.0
            .map(doubleSquareRoot)      // dann Wurzel ziehen -> Werte 3.0, 9.0, 8.0
            .reduce(sumDoubles).get();  // alle zusammenzaehlen und von Optional<Double> in Double verwandeln

        System.out.println("\nResult: " + reduce);

    }

}