public class ConstructorWithoutParameter {

    int x;

    public ConstructorWithoutParameter() {   //constructor method
        x = 5;
    }

    public static void main ( String[] args ) {
        ConstructorWithoutParameter obj1 = new ConstructorWithoutParameter();
        System.out.println(obj1.x);

        ConstructorWithoutParameter obj2 = new ConstructorWithoutParameter();
        obj2.x = 2;
        System.out.println(obj2.x);
    }
}