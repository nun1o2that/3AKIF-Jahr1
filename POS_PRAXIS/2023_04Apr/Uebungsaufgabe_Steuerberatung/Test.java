import java.math.BigDecimal;

/**
* ignore, nur zum Testen
**/
public class Test {
    
    public static void main ( String[] args ) {

        BigDecimal b1 = new BigDecimal(0);
        BigDecimal b2 = new BigDecimal(123.432);

        /* Zuweisung hier benoetigt, sonst gehts nit! add() gibt den neuen Wert zurueck */
        b1 = b1.add(b2);
        b1 = b1.add(new BigDecimal("765.3"));

        System.out.println(b1);

    }
    
}
