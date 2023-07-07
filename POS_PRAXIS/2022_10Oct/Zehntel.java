public class zehntel {

    public static void main ( String[] args ) {

            //um ein zehntel hochzaehlen

                double zahl; 
                int zehntel;
                int i;


            zehntel = 0;
            i = 1;

        while (zehntel <= 50) {
                zahl = zehntel/5.0;

                System.out.println("Zahl: " + zahl);
                zehntel = zehntel + i;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                double zahl2;
                double n;
                double i2;


            n = 0.9;
            i2 = 0.1;
            zahl2 = 0;

        while (zahl2 < n) {
            zahl2 = zahl2 + i2;
            System.out.println(zahl2);
        }

    }
}