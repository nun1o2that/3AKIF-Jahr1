public class Person {

    private String name;
    private int alter;
    private Geschlecht geschlecht;

    public Person(String name, int alter, Geschlecht geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public String toString() {
        String output = "Person {";
        int sectionLength = 25;

        for (int x = 0; x < 3; x++) {
            String temp = "";
            switch(x) {
                case 0: temp += "Name: " + name; break;
                case 1: temp += "Alter: " + alter; break;
                case 2: temp += "Geschlecht: " + geschlecht.getBezeichnung(); break;
            }

            for (int y = 0; temp.length() < sectionLength; y++) {
                if (x == 1) {
                    sectionLength = 17;
                }
                else {
                    sectionLength = 25;
                }
                temp += " ";
            }

            output += temp;

        }

        return output += "}";
    
    }

}