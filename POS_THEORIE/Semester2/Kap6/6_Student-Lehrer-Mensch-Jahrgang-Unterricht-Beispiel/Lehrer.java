import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Lehrer extends Mensch{

    private List<Unterricht> unterrichtet;
    private List<Fach> faecher;

    public Lehrer(String name, LocalDate geburtstag) {
        super(name, geburtstag);
    }

    public void setUnterrichtet(List<Unterricht> unterrichtet) {
        this.unterrichtet = unterrichtet;
    }

    public void setFaecher(List<Fach> faecher) {
        this.faecher = faecher;
    }

    public String outputUnterrichtet() {
        String output = "{";
        for (int i = 0; i < unterrichtet.size(); i++) {
            output += "\n        " + unterrichtet.get(i);
        }
        return output;
    }

    public String outputFaecher() {
        String output = "";
        for (int i = 0; i < faecher.size(); i++) {
            output += "\n        Fach {";
            output += "\n            " + faecher.get(i).getKurzname();
            output += "\n            " + faecher.get(i).getLangname();
            output += "\n        }";
        }
        return output;
    }

    public String toString() {
        String output = "\nLehrer {";
        output += super.toString();
        output += "\n\n    UNTERRICHTET " + outputUnterrichtet() + "\n    }";
        output += "\n\n    FAECHER {" + outputFaecher() + "\n    }";
        output += "\n}";
        return output;
    }

}