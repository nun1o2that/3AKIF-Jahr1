import java.time.LocalDate;

public class Student extends Mensch {

    private String matrikelnummer;

    public Student(String name, LocalDate geburtstag, String matrikelnummer) {
        super(name, geburtstag);
        this.matrikelnummer = matrikelnummer;
    }

    public String toString() {
        String output = "";
        output += "        Student {";
        output += "\n                Name : " + name + ";";
        output += "\n                Geburtstag : " + geburtstag + ";";
        output += "\n                Matrikelnummer : " + matrikelnummer + ";";
        output += "\n            }";
        return output;
    }

}