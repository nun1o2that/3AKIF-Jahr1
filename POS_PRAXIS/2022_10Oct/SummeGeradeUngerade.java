import java.util.Scanner;

// Anwender gibt einen Wert N ein
// Addieren der geraden, ungeraden und aller Integer von 0 bis N
//
public class SummeGeradeUngerade{

    public static void main (String[] args ) {

        Scanner scan = new Scanner( System.in );
        int zahl, summeAlle = 0, summeGerade = 0, summeUngerade = 0;

        System.out.println( "Geben Sie den Grenzwert ein:" );
            zahl = scan.nextInt();

        
            int i = 0 ;

            while (  i <= zahl )
            {
            summeAlle = summeAlle + i ;

                    // if ( i % 2 == 0  )
                    // summeGerade = summeGerade + i ;

                    // else
                    // summeUngerade  = summeUngerade  + i ;

                    i = i + 1 ;
            }

        System.out.print  ( "Summe aller: " + summeAlle  );
        // System.out.print  ( "\tSumme der geraden: " + summeGerade );
        // System.out.println( "\tSumme der ungeraden: " + summeUngerade  );
}
}