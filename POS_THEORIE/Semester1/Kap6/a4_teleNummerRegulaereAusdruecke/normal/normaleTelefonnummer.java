public class normaleTelefonnummer {

    public static void menue() {
        System.out.println("-------------------------------");
        System.out.println("   1 - ohne Vorwahl");
        System.out.println("   2 - mit Vorwahl");
        System.out.println("   3 - Beenden");
        System.out.println("-------------------------------");
        System.out.println("Welche Option?");
    }

    public static void main ( String[] args ) {

            int userInt;
            Scanner scan = new Scanner(System.in);

        // Erstelle regulaere Ausdruecke fuer eine gueltige E-Mail-Adresse und fuer Telefonnummern 
        // (z.B. 0664/1234567 und +43 677 1234567) und implementiere diese in Java 

        do {
            menue();    
            userInt = scan.nextInt();
        }  while();

    }
}