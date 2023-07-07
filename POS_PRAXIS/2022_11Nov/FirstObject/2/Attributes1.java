//attributes / fields // instanzvariablen / datenfelder
public class Attributes1 {

        int zahl1 = 200;
        int zahl2 = 69;             //lol
        final int zahlFinal = 10;   //cannot be overwritten, useful eg. for fixed numbers like PI;; final is a MODIFIER
        
    public static void main ( String[] args ) {

        //accessing attributes by creating an object of the class, using dot (.) syntax
        attributes1 Object = new attributes1();
        System.out.println("zahl1 unmodified: " + Object.zahl1);
        System.out.println("zahl2 unmodified: " + Object.zahl2);

        //modifying attribute values (setting values, if attributes arent initialized, or overriding existing values if they have)
        Object.zahl1 = 69;
        Object.zahl2 = 200;
        System.out.println();
        System.out.println("zahl1 modified: " + Object.zahl1);
        System.out.println("zahl2 modified: " + Object.zahl2);

        //trying to modify a "final" attribute will lead to an error
        System.out.println();
        System.out.println("zahlFinal unmodified: " + Object.zahlFinal);
        // Object.zahlFinal = 11;
        // System.out.println("zahlFinal modified: " + Object.zahlFinal);

    }

}

