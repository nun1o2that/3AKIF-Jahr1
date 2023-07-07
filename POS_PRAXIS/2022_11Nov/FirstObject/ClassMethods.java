public class ClassMethods {

    //static method: CAN BE CALLED WITHOUT CREATING OBJECTS
    static void staticMethod() {
        System.out.println("staticMethod() is static, meaning it can be called without creating objects.");
    }

    public void publicMethod() {
        System.out.println("publicMethod() is public, meaning it CANNOT be called without creaeting objects.");
    }


    public static void main ( String[] args ) {
        ClassMethods Object = new ClassMethods();

        staticMethod();         //called without creating objects
        Object.publicMethod();  //called WITH a created object
    } 

}