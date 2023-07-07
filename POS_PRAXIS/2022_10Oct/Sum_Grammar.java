import java.util.Scanner;

public class Sum_Grammar {

    public static void main ( String[] args ) {


                    long integer;
                    int counter = 0;
                    int sum = 0;

                    String counterString;
                    int counterDigits;
                    char digit1;
                    char digit2 = '0';

                    Scanner input = new Scanner(System.in);


        System.out.println("Add integers, loops n' shit" + "\n");


        System.out.print("Enter the 1st integer (0 to quit): ");
                integer = input.nextLong();

        //1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10th 
        //11th 12th 13th 14th 15th 16th 17th 18th 19th 20th
        //21st 22nd 23rd 24th 25th 26th 27th 28th 29th 30th... 100th

        // 101st 102nd 103nd 104th 105th 106th 107th 108th 109th 110th
        // 110th 111th 112th...

                while (integer != 0) {

                    sum = sum + (int)integer;                           //summe der integer
                    System.out.println("Sum: " + sum);

                    counter++;

                    counterString = Long.toString(integer);             //
                    counterDigits = (int) (Math.log10(integer));
                    digit1 = counterString.charAt(counterDigits);   //einzerziffer
                    // digit2 = counterString.charAt(counterDigits - 1);   //zehnerziffer

                    // System.out.println("c" + counterDigits);

                    // // counterDigits = counterDigits - 2;
                    // System.out.println(counterDigits);

                        if (counterDigits < 0) {
                            digit2 = '0';   //char immer it ' '
                        }

                        else if (counterDigits >= 1) {
                            digit2 = counterString.charAt(counterDigits - 2);
                        }
                        
                      

                        System.out.println("digit1: " + digit1 + ", digit2: " + digit2);

                    // if ( (digit1 == 1) && !(digit2 == '1') ) {
                    //     System.out.print("Enter the " + counter + "st  integer (0 to quit):");
                    // }

                    // else if ( (digit1 == 2) && !(digit2 == '1') ) {
                    //     System.out.print("Enter the " + counter + "nd  integer (0 to quit):");
                    // }

                    // else if ( (digit2 == 3) && !(digit2 == '1') ) {
                    //     System.out.print("Enter the " + counter + "rd  integer (0 to quit):");
                    // }

                    // else {
                    //     System.out.print("Enter the " + counter + "th  integer (0 to quit):");
                    // }
                    
                    integer = input.nextInt();
                    System.out.println("");

                }

    }
}