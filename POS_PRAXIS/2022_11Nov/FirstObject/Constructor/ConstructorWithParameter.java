import java.util.Scanner;

public class ConstructorWithParameter {
    int x;

    public ConstructorWithParameter(int x) {
        this.x = x;     //this means the x referred to is the int x of THIS method (CONSTRUCTOR), not the unitialized attribute in the top
        // hi me from half a year later. ^ what did he mean by this
    }

    public static void main ( String[] args ) {

            Scanner scan = new Scanner(System.in);
            int number;
            

        System.out.print("what number do you want for this object? ");
            number = scan.nextInt();
    
        ConstructorWithParameter obj1 = new ConstructorWithParameter(number);
        System.out.println(obj1.x);
    }
}