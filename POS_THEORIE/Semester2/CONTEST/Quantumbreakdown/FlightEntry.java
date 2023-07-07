import java.util.List;

public class FlightEntry {

    int timestamp;
    float latitude;
    float longitude;
    float altitude;
    String start;
    String destination;
    int takeoff;
    int flightCount;

    public FlightEntry(int timestamp, float latitude, float longitude, float altitude, String start, String destination, int takeoff) {
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.start = start;
        this.destination = destination;
        this.takeoff = takeoff;
        this.flightCount = 0;
    }

    public void countFlightsOfThisType(List<FlightEntry> flights) {
        for (FlightEntry f : flights) {
            if (f.start == this.start && f.destination == this.destination) {
                flightCount++;
            }
        }
    }    

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return timestamp + "," + latitude + "," + longitude + "," + altitude + "," + start + "," + destination + "," + takeoff;
    }

    public String returnResult() {
        return start + " " + destination + " " + flightCount;
    }

}