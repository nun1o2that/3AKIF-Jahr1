public class Festplatte {

    // Komposition (starke Assoziation)
    private Lesekopf lesekopf;
    private Schreibkopf schreibkopf;

    public Festplatte(Lesekopf lesekopf, Schreibkopf schreibkopf) {
        this.lesekopf = lesekopf;
        this.schreibkopf = schreibkopf;
    }

    public String toString() {
        String output = "\nFestplatte: Lesekopf, Schreibkopf";
        return output;
    }
    
}