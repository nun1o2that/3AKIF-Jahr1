import java.util.ArrayList;

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planet(int number) {
        this.number = number;
    }
}

public class Enumerations {

    public static void canILiveHere(Planet p) {
        switch(p) {
            case EARTH: System.out.println("You can live here!"); break;
            default: System.out.println("DEATH AND DESTRUCTION!!!"); break;
        }
        System.out.println("This is planet #" + p.number + "\n");
    }

    public static void main ( String[] args ) {

        Planet myPlanet = Planet.EARTH;
        canILiveHere(myPlanet);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(7);

        list.forEach(i -> {System.out.println(i);});
        
    }

}