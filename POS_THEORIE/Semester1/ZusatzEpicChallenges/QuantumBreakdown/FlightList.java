import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class FlightList {

    List<FlightEntry> flights;

    public FlightList() {
        flights = new ArrayList<FlightEntry>();
    }

    public List<Integer> getTimestamps() {
        List<Integer> timestamps;
        timestamps = flights.stream()
            .map(FlightEntry::timestamp)
            .collect(Collectors.toList());
        return timestamps;
    }

    public List<Float> getLatitudes() {
        List<Float> latitudes;
        latitudes = flights.stream()
            .map(FlightEntry::latitude)
            .collect(Collectors.toList());
        return latitudes;
    }

    public List<Float> getLongitudes() {
        List<Float> longitudes;
        longitudes = flights.stream()
            .map(FlightEntry::longitude)
            .collect(Collectors.toList());
        return longitudes;
    }

    public List<Float> getAltitudes() {
        List<Float> altitudes;
        altitudes = flights.stream()
            .map(FlightEntry::altitude)
            .collect(Collectors.toList());
        return altitudes;
    }

    public String toString() {
        String output = "";
        for (FlightEntry f : flights) {
            output += f + "\n";
        }
        return output;
    }

}