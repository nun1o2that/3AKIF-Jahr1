public class Aufgabe6{

    public static void main ( String[] args ){

                boolean a = true;
                boolean b = false;
                boolean c = true;

        System.out.println("----------------------------------------------------");
        System.out.println("                   Funktionstabelle");
        System.out.println("----------------------------------------------------");

        System.out.println("\n" + " ZUM BEISPIEL");
        System.out.println("    boolean a = true");
        System.out.println("    boolean b = false");
        System.out.println("    boolean c = true");



        System.out.println("\n" + "\n" + "      1.  ( !(a || b) && !!c) { ... }");

                if(!(a || b) && !!c){
                    System.out.println("\n" + "            ---> der Ausdruck gibt TRUE aus :)");
                }
                else{
                    System.out.println("\n" + "            ---> der Ausdruck gibt FALSE aus :(");
                }



        System.out.println("\n" + "\n" + "      2.  ( (a & !b & c) || (c^c)) { ... }");

                if((a & !b & c) || (c^c)){
                    System.out.println("\n" + "             ---> der Ausdruck gibt TRUE aus :)");
                }
                else{
                    System.out.println("\n" + "             ---> der Ausdruck gibt FALSE aus :(");
                }



        System.out.println("\n" + "----------------------------------------------------");
    }
}