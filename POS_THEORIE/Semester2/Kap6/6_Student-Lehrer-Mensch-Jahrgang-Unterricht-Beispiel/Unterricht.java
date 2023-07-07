import java.time.LocalDate;

public class Unterricht {

    private Student student;
    private LocalDate von;
    private LocalDate bis;
    private int note;
    private Fach fach;

    public Unterricht(Student student, LocalDate von, LocalDate bis, int note, Fach fach) {
        this.student = student;
        this.von = von;
        this.bis = bis;
        this.note = note;
        this.fach = fach;
    }

    public String toString() {
        String output = "Unterricht {";
        output += "\n    " + student;
        output += "\n            Von : " + von + ";";
        output += "\n            Bis : " + bis + ";";
        output += "\n            Note : " + note + ";";
        output += "\n            Fach {";
        output += "\n                " + fach.getKurzname();
        output += "\n                " + fach.getLangname();
        output += "\n            }";
        output += "\n        }";
        return output;
    }

}