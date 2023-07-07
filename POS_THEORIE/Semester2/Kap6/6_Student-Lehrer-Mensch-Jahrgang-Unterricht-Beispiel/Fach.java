public class Fach {

    private String kurzname;
    private String langname;

    public Fach(String kurzname, String langname) {
        this.kurzname = kurzname;
        this.langname = langname;
    }

    public String getKurzname() {
        return "Kurzname : " + kurzname + ";";
    }

    public String getLangname() {
        return "Langname : " + langname + ";";
    }

}