import java.time.LocalDate;

public class Mensch {

    protected String name;
    protected LocalDate geburtstag;

    public Mensch(String name, LocalDate geburtstag) {
        this.name = name;
        this.geburtstag = geburtstag;
    }

    public String toString() {
        String output = "";
        output += "\n    Name : " + name + ";";
        output += "\n    Geburtstag : " + geburtstag + ";";
        return output;
    }

}