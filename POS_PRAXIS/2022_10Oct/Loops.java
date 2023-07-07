import java.util.Scanner;

public class Loops {

    public static void main ( String[] args ) {

        //www.beginwithjava.com/java/lops/questions.html

        Scanner eingabe = new Scanner(System.in);



    System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 1");

                //Write a program to print numbers from 1 to 10.

                System.out.print("" + "\n");

                    int start1 = 0;

                while (start1 <= 10) {
                    System.out.print(start1 + " ");
                    start1++;
                }




    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 2");

                //Write a program to calculate the sum of first 10 natural number.

                System.out.print("Write a program to calculate the sum of first 10 natural number." + "\n");

                    int start2 = 0;
                    int summe2 = 0;

                while (start2 < 10) {
                    summe2 = summe2 + start2;
                    start2 = start2 + 1;
                }

                System.out.print (summe2 + " ");




    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 3");

                //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

                System.out.println("Write a program that prompts the user to input a positive integer. ");
                System.out.println("It should then print the multiplication table of that number." + "\n");

                    int zahl3;
                    int faktor3 = 1;
                    int produkt3 = 0;

                System.out.println("--------------------------------");
                System.out.print("Positiven Integer eingeben: ");
                    zahl3 = eingabe.nextInt();

                while (produkt3 < (zahl3 * 10)) {
                    produkt3 = zahl3 * faktor3;
                    faktor3++;
                    System.out.print(produkt3 + " ");
                }




    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 4");

                //Write a program to find the factorial value of any number entered through the keyboard. 

                System.out.println("Write a program to find the factorial value of any number entered through the keyboard." + "\n");

                    int zahl4;
                    int faktor4;
                    int produkt4 = 1;

                System.out.println("--------------------------------");
                System.out.print("Integer eingeben: ");
                    zahl4 = eingabe.nextInt();

                // while () {
                    
                // } ???????????
                    
                System.out.println(produkt4);

    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 5");

    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 6");

    System.out.println("\n" + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           Question 7");

    }
}