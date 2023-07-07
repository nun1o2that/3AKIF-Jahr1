public class Aufgabe1_doppelt_IstGleichOperator {

    public static void main ( String[] args ) {

        String str1;
        String str2;
        String str3;
        String str4;
        int summe = 0;

        str1 = "Bo, die Katze";
        str2 = "Bo, die Katze";

        str3 = new String("Fred, der Hund");
        str4 = new String("Fred, der Hund");

        //ausgaben zu == operator und .equals()
            if (str1 == str2) {
                System.out.println("str1 == str2 : true") ;
            }
            else {
                System.out.println("str1 == str2 : false");
            }

            if (str1.equals(str2)) {
                System.out.println("str1.equals(str2) : true");
            }
            else { 
                System.out.println("str1.equals(str2) : false");
            }


            if (str3 == str4) {
                System.out.println("str3 == str4 : true") ;
            }
            else {
                System.out.println("str3 == str4 : false");
            }

            if (str3.equals(str4)) {
                System.out.println("str3.equals(str4) : true");
            }
            else { 
                System.out.println("str3.equals(str4) : false");
            }

        //summe der erstellten objekte
            if (str1 == str2) {
                summe += 1;
            }
            else {  
                summe += 2;
            }


            if (str3 == str4) {
                summe += 1;
            }
            else {
                summe += 2;
            }

        System.out.println(summe);

    }
}