public class Main {
    
    public static void main (String[] args) {

        // Komponente : 
        // String produktNummer;
        // String hersteller;
        // String modellbezeichnung;

        // Aggregation: Einzelteile existieren weiter, selbst wenn Laptop-Objekt geloescht wird
        Gehaeuse gehaeuse = new Gehaeuse("1", "Asus", "Prime AP201", "Weiss", "Tempered Glass", 20, 60, 50);

        Prozessor prozessor = new Prozessor();
        Ram ram = new Ram();
        Mainboard mainboard = new Mainboard("2", "Intel", "Z790", 12, prozessor, ram);

        Bildschirm bildschirm = new Bildschirm("3", "Alienware", "34 Inch");

        // Aggregation zw. Laptop & Festplatte
        // Lesekopf und Schreibkopf: Komposition! Wenn Festplatte geloescht wird, verschwinden auch die 2    
        Festplatte festplatte = new Festplatte(new Lesekopf(), new Schreibkopf());

        Laptop laptop = new Laptop("4", "Lenovo", "ThinkPad", 400, gehaeuse, mainboard, bildschirm, festplatte);

        System.out.println(laptop);

    }

}
