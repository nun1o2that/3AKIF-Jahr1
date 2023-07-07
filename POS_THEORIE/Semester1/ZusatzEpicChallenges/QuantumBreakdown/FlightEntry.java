/* ein record ist wie eine gekuerzte klasse */
/* erstellen vom konstruktor, von getter-methoden, hashCode(), toString() und equals() */
/* diese koennen aber auch ueberschrieben werden */
public record FlightEntry(int timestamp, float latitude, float longitude, float altitude) {
    
    @Override
    public String toString() {
        return timestamp + "," + latitude + "," + longitude + "," + altitude;
    }

}