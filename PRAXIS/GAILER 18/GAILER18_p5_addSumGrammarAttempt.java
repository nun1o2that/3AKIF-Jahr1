import java.util.Scanner;

public class GAILER18_p5_addSumGrammarAttempt {

    public static void main ( String[] args ) {


                int n;          //integer user enters
                int sum = 0;    //sum of integers

                int z = 1;      //number of integers that have been typed; 1 instead of zero because we ask for the "first number" before the loop
                int zLaenge;    //number of digits of integer
                char einzer;    //char data type in order to do charAt(), rightmost / 'last' digit
                char zehner;    //char data type in order to do charAt(), second to last digit


                Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number (0 to quit): ");
            n = input.nextInt();


                while (n != 0) {    //while the entered integer is anything but zero, repeat the loop


                    sum = sum + n;                              //sum of entered integers so far
                    System.out.println("Sum: " + sum + "\n");          //output of sum

                    z++;                                        //number of entered integers, +1 each iteration
                    zLaenge = (int)(Math.log10(z)) + 1;         //'length' of entered integer (number of digits)




                        einzer = Integer.toString(z).charAt(zLaenge - 1);       //converting integer to String, grabbing the number in the rightmost digit by    
                                                                                //subtracting 1 from the length (String indexes range from 0-n)

                        if (zLaenge == 1) {   
                            zehner = '0';     //number below ten; subtracting one from the length causes a runtime error (-1 is out of bounds for String indexes)
                        }

                        else {
                            zehner = Integer.toString(z).charAt(zLaenge - 2);       //for any number >= 10
                        }



                    //right grammar, depending on the number of integers we've added 

                        if ( (einzer == '1') && !(zehner == '1') ) {
                            System.out.print("Enter the " + z + "st number (0 to quit): ");     //while the rightmost digit is 1 and our number ranges from anything that
                        }                                                                       //isn't 11-19 (i think lol), write "th"

                        else if ( (einzer == '2') && !(zehner == '1') ) {
                            System.out.print("Enter the " + z + "nd number (0 to quit): ");     //while the rightmost digit is 2 and our number ranges from anything that
                        }                                                                       //isn't 11-19, write "nd"

                        else if ( (einzer == '3') && !(zehner == '1') ) {
                            System.out.print("Enter the " + z + "rd number (0 to quit): ");     //while the rightmost digit is 1 and our number ranges from anything that
                        }                                                                       //isn't 11-19, write "rd"

                        else {
                            System.out.print("Enter the " + z + "th number (0 to quit): ");     //in any other case, write "th"
                        }

                        n = input.nextInt();    //user enters next integer


                } //loop end


    }
}
        //1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10th 
        //11th 12th 13th 14th 15th 16th 17th 18th 19th 20th
        //21st 22nd 23rd 24th 25th 26th 27th 28th 29th 30th... 100th

        // 101st 102nd 103nd 104th 105th 106th 107th 108th 109th 110th
        // 110th 111th 112th...