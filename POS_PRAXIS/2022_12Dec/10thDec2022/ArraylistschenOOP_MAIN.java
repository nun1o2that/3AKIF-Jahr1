public class ArraylistschenOOP_MAIN {

    public static void main ( String[] args ) {

        ArraylistschenOOP meineArrays = new ArraylistschenOOP();

            String userString;
            int userInt;

            do {

                System.out.println("\n" + "------------------------------------------");
                System.out.println(" ZE = Zahlenarray erstellen");
                System.out.println(" ZF = Zahlenarray fuellen");
                System.out.println(" ZA = Zahlenarray ausgeben");
                System.out.println("");
                System.out.println(" BE = Buchstabenarray erstellen");
                System.out.println(" BF = Buchstabenarray fuellen");
                System.out.println(" BA = Buchstabenarray ausgeben");
                System.out.println("");
                System.out.println(" Q = Programm beenden");
                System.out.println("------------------------------------------");
                    userString = meineArrays.scan.next();

                if ( userString.equals("ZE") || userString.equals("ze") ) {
                    meineArrays.zahlenErstellen();
                }
                else if ( userString.equals("ZF") || userString.equals("zf") ) {
                    meineArrays.zahlenFuellen();
                }
                else if ( userString.equals("ZA") || userString.equals("za") ) {
                    meineArrays.zahlenAusgeben();
                }

                else if ( userString.equals("BE") || userString.equals("be") ) {
                    meineArrays.buchstabenErstellen();
                }
                else if ( userString.equals("BF") || userString.equals("bf") ) {
                    meineArrays.buchstabenFuellen();
                }
                else if ( userString.equals("BA") || userString.equals("ba") ) {
                    meineArrays.buchstabenAusgeben();
                }

            } while( !(userString.equals("Q")) || !(userString.equals("q")) );
    }
}

