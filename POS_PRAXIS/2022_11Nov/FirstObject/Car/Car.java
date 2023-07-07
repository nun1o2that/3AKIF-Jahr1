public class Car {

    String type;
    String color;
    String minus = "-";

    int movex = 0;
    int movey = 0;
    int differencex;
    int differencey;


    public void changeType(String typechange) {
        type = typechange;
    }

    public void changeCarColor(String colorchange) {
        color = colorchange;
    }

    public void moveCar(int x, int y) {

        if (movex > x) {
            differencex = movex - x;
        }
        else {
            differencex = x - movex;
        }


        if (movey > y) {
            differencey = movey - y;
        }
        else {
            differencey = y - movey;
        }
        
        movex = x;
        movey = y;
    }

    public void showAttributes() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("the car's type is: " + type);
        System.out.println("the car's color is " + color);
        System.out.println("the car's current position is at (" + movex + "|" + movey + ")");
        System.out.println("the car moved (" + differencex + "|" + differencey + ") from the previous position");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}