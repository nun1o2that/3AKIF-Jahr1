import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int n = 5;

        // Daten aus der PDF entnommen
        FlightList fL = new FlightList();
        fL.flights.add(new FlightEntry(136932,48.297f,16.503f,1379f));
        fL.flights.add(new FlightEntry(144068,45.262f,39.702f,1866f));
        fL.flights.add(new FlightEntry(212782,41.287f,2.089f,0f));
        fL.flights.add(new FlightEntry(370277,43.959f,21.427f,11582f));
        fL.flights.add(new FlightEntry(578963,51.531f,19.923f,10058f));

        // print input
        System.out.println("\n" + n);
        System.out.print(fL);

        int minTimestamp = Collections.min(fL.getTimestamps());
        int maxTimestamp = Collections.max(fL.getTimestamps());
        float minLat = Collections.min(fL.getLatitudes());
        float maxLat = Collections.max(fL.getLatitudes());
        float minLong  = Collections.min(fL.getLongitudes());
        float maxLong = Collections.max(fL.getLongitudes());
        float maxAltitude = Collections.max(fL.getAltitudes());

        // print output
        System.out.println();
        System.out.println(minTimestamp + " " + maxTimestamp);
        System.out.println(minLat + " " + maxLat);
        System.out.println(minLong + " " + maxLong);
        System.out.println(maxAltitude);

    }

}
