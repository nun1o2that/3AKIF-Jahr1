public enum Geschlecht {

    M("maennlich"),
    W("weiblich"),
    X("divers"),
    K("keine Angabe");

    private final String bezeichnung;

    /* privater Enum Konstruktor */
    private Geschlecht(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

}