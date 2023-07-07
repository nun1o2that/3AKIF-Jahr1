import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Comparator;

public class Main {
    
    public static void main (String[] args) {

        int n = 10;
        List<FlightEntry> flights = new ArrayList<FlightEntry>();

        // Daten aus der PDF entnommen
        flights.add(new FlightEntry(34103, 51.331f, -0.393f, 3962.0f, "LPPT", "EGLL", 26949));
        // extra Zeile zum Ueberpruefen der distinct() Funktion unten
        // flights.add(new FlightEntry(34103, 51.331f, -0.393f, 3962.0f, "LPPT", "EGLL", 26949));
        flights.add(new FlightEntry(107649, 38.024f, -2.556f, 10972.0f, "LEMG", "ESSA", 106411));
        flights.add(new FlightEntry(113591, 49.003f, 17.515f, 10363.0f, "LLBG", "EDDB", 102016));
        flights.add(new FlightEntry(223214, 53.469f, 25.524f, 9448.0f, "LSGG", "UUEE", 215051));
        flights.add(new FlightEntry(294080, 54.146f, 8.657f, 11574.0f, "EKCH", "EGKK", 292283));
        flights.add(new FlightEntry(375909, 48.051f, 0.808f, 11887.0f, "EGGW", "LEBL", 373584));
        flights.add(new FlightEntry(636037, 53.141f, -0.391f, 10058.0f, "EIDW", "LZIB", 634073));
        flights.add(new FlightEntry(649847, 53.564f, 9.846f, 1828.0f, "EDDH", "EGLL", 649106));
        flights.add(new FlightEntry(652143, 46.948f, -1.463f, 10675.0f, "EBBR", "LPPT", 648044));
        flights.add(new FlightEntry(659210, 52.59f, 6.392f, 10363.0f, "EKCH", "EBBR", 655729));
        
        System.out.println("\n" + n);
        flights.forEach(System.out::println);

        flights.forEach(f -> f.countFlightsOfThisType(flights));

        List<FlightEntry> results = new ArrayList<FlightEntry>();
        results = flights.stream()
            .sorted(Comparator.comparing(FlightEntry::getStart).thenComparing(FlightEntry::getDestination))
            .collect(Collectors.toList());

        List<String> resultStrings = results.stream()
            .map(FlightEntry::returnResult)
            .distinct()
            .collect(Collectors.toList());

        System.out.println();
        resultStrings.forEach(System.out::println);

    }

}