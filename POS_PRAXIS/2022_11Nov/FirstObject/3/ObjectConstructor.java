public class ObjectConstructor {
    int zahl = 10;

    public static void main ( String[] args ) {
        ObjectConstructor myObj = new ObjectConstructor();    //objects are created FROM A CLASS,, to create object, specify class name, followed by object name, keyword new
        System.out.println(myObj.zahl); 

        ObjectConstructor myObj2 = new ObjectConstructor();   //create several objects in one class
        System.out.println(myObj2.zahl);
    }   

    //you can also create an object of a class and access it in another class
    //better organization of classes 
    //eg. one class has all attributes and methods, while the other class holds the main() method (code to be executed)

    //name of java file should match file name -> more than one class equals more than one file

}