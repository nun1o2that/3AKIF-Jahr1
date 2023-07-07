public class Program {

    public static void main ( String[] args ) {

        third ThirdFileObject = new third();

        System.out.print("what is their name? ");
            ThirdFileObject.name = ThirdFileObject.scanThird.nextLine().trim();

        System.out.print("how old are they? ");
            ThirdFileObject.age = ThirdFileObject.scanThird.nextInt();

        System.out.println("this person is called " + ThirdFileObject.name + " and is " + ThirdFileObject.age + " years old.");

    }
}