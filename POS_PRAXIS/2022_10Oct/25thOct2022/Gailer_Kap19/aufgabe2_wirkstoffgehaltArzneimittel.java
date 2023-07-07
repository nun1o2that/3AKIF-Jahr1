public class a2_wirkstoffgehaltArzneimittel {

    public static void main ( String[] args ) {

        //arzneimittel verliert jeden monat 4% seines wirkstoffgehalts
        //wenn gehalt unter 50% faellt, muss es ausgemustert werden
        // programm berehcnet wie viele monate das mittel gelagert werden kann


                int monatZaehler = 0;

                double wirkstoffGehalt = 100;


        System.out.println(" \n Wirkstoffgehalt eines Arzneimittels");
        
        do {

            System.out.println();
            wirkstoffGehalt *= 0.96;

            System.out.print("Monat " + monatZaehler + ":   ");
            System.out.print("Wirkstoffgehalt: " + wirkstoffGehalt);

            monatZaehler++;

        } while (wirkstoffGehalt > 50);

        System.out.print("  ABGELAUFEN \n");

    }
}