/**
* Implementierung eines simplen Stacks mit LIFO-Prinzip (Last in, First out)
* Speicherung von Daten in einem Integer(Wrapper)-Array mit fixer Laenge, vom User in der Main-Klasse angegeben
**/
public class MyStack {

    Integer[] array;

    /**
    * Konstruktor der Klasse MyStack
    * @param length array wird mit dieser vom User eingegebenen Laenge initialisiert
    **/
    public MyStack(int length) {
        array = new Integer[length];
        initialFill();
    }

    /**
    * Bei der ersten Initialisierung wird jeder Wert des array mit null gefuellt
    **/
    public void initialFill() {
        int counter = 0;

        while (counter < array.length) {
            array[counter] = null;
            counter++;
        }

    }

    /**
    * Methode zum Fuellen des Stacks
    * der counter durchlaeuft das array von Index 0 an. Der erste Index mit dem Wert null wird mit x befuellt
    * zaehlt der counter ueber die array-Laenge hinaus (alle Stellen schon belegt), wird x nicht gepusht
    * @param x vom User eingegebener Wert, der zur Liste hinzugefuegt wird
    **/
    public void push(int x) {
        int counter = 0;
        boolean pushed = false;

        /* waehrend nichts schon gepusht wurde und die counter-Laenge unter der array-Laenge liegt */
        while (!pushed && counter < array.length) {
            if (array[counter] == null) {
                array[counter] = x;
                pushed = true;
            }
            else {
                counter++;
            }
        }

        if (counter < array.length) {
            System.out.println("\n" + "Erfolgreich gepusht!");
        }
        else {
            System.out.println("\n" + "Liste ist voll!");
        }

    }

    /**
    * Methode zum Entfernen von Werten aus dem Stack
    * der counter durchlaueft das array von HINTEN beginnend
    * z.B ein array mit der Laenge 5 hat die Indexe 0, 1, 2, 3, 4 - der counter beginnt also bei 4
    * @return der Wert der entfernt wurde, oder null wenn die Liste schon leer ist, wird returned und in der Main-Klasse ausgegeben
    **/
    public Integer pop() {
        int counter = array.length - 1;
        Integer value = 0;
        boolean popped = false;

        /* waehrend nichts schon gepoppt wurde und der counter einen gueltigen Index-Wert hat (bis 0) */
        while (!popped && counter >= 0) {
            if (array[counter] != null) {
                value = array[counter]; /* Wert an der richtigen Stelle in eine einzelne Variable abgespeichert, damit sie returned werden kann */
                array[counter] = null;  /* an der richtigen Stelle wird der Wert dann auf null gesetzt -> "entfernt" */
                popped = true;
            }
            else {
                counter--;
            }
        }

        if (counter < 0 && !popped) {
            System.out.print("\n" + "Die Liste ist schon leer!");
            value = null;
        }

        return value;

    }

    /**
    * Methode zum Ausgeben des letzten Wert im Stack
    * der counter zaehlt herunter - siehe pop()
    * @return 
    **/
    public Integer peek() {
        int counter = array.length - 1;
        boolean peeked = false;
        boolean index0 = false;
        Integer returned = 0;

        /* solange nichts schon gepeeked wurde oder der letzte gueltige Index erreicht wurde (0) */
        while ( !peeked && !index0 ) {
            if (array[counter] != null) {
                peeked = true;  /* der erste nicht-null-Wert der gefunden wird returned */
                returned = array[counter];
            }
            else if (counter == 0 && array[counter] == null) {
                index0 = true;  /* wenn kein nicht-null-Wert gefunden wird wird der counter bis 0 runterzaehlen */
                returned = null;/* und "null" wird zurueckgegeben */
            }
            else {
                counter--;
            }
        }

        return returned;
    }

}