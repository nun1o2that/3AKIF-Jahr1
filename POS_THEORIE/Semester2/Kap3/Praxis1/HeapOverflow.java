/**
* Diese Klasse dient dem Vorzeigen eines Heapoverflows mittels eines grossen Stringarrays
* bei mir funktioniert es mit den JVM-Einstellungen -Xms1024k -Xmx2056k (Startspeicher 1024 Kilobyte, Endspeicher 2056 Kilobyte). 
**/
public class HeapOverflow {

    /* main()-Methode */    
    public static void main ( String[] args ) {

        String[] over = new String[1000000];
        for (int i = 0; i < 999999; i++) {
            over[i] = new String("String" + i);
        }

    }

}