import java.util.List;
import java.util.ArrayList;

public class Jahrgang {

    private String stammklasse;
    private List<Student> studenten;

    public Jahrgang(String stammklasse) {
        this.stammklasse = stammklasse;
    }

    public void setStudenten(List<Student> studenten) {
        this.studenten = studenten;
    }

    public String outputStudenten() {
        String output = "{";
        for (int i = 0; i < studenten.size(); i++) {
            output += studenten.get(i);
        }
        return output;
    }

    public String toString() {
        return "Jahrgang {Stammklasse : " + stammklasse + "; Studenten : " + studenten + "}";
    }

}