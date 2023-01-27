import java.util.Scanner;

public class crimmus {

    public static void main ( String[] args ) {

        //STANDARD
        //leerezeichen bis zur spitze des baumes: 7
        //sterne bis zur haelfte des baumes: 7


                int n;

                int counter1 = 0;
                int counter2 = 0;

                int zaehlerLeer = 7;
                int zaehlerSterne = 1;

                
                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "------------------------------------------");
        System.out.println("+ * + * + * + Weihnachtsbaum + * + * + * +");
        System.out.println("------------------------------------------" + "\n");

    
        System.out.print("n eingeben (mindestens 7): ");
            n = eingabe.nextInt();

        System.out.println("");



            while (zaehlerLeer < n) {
                zaehlerLeer++;              //leerzeichen bis erste zeile, spitze des baumes bestimmen
            }

            // while (zaehlerStern < n) {      //sterne bis zur haelfte, unterste blaetter zeile
            //     zaehlerStern++;
            // }



            while (counter1 <= n) {                     //schleife fuer die blaetter 
  
                    while (counter2 < zaehlerLeer) {
                            System.out.print(" ");
                            counter2++;
                    }

                            counter2 = 0;

                    while (counter2 < zaehlerSterne) {
                            System.out.print("*");
                            counter2++;
                    }


                    counter2 = 0;
                    zaehlerLeer--;
                    zaehlerSterne = zaehlerSterne + 2;

                    counter1++;
                    System.out.println("");

                }





                counter1 = 0;
                counter2 = 0;

                zaehlerLeer = 1;
                zaehlerLeer = n * 2 - 1;

                zaehlerSterne = 1;

                // while (zaehlerLeer < n) {               //schleife zur bestimmung der leerzeichen vor stamm
                //     zaehlerLeer++;
                // }



                while (zaehlerSterne < n ) {
                    zaehlerSterne++;
                }
            

                    while ( (counter1 + 4 ) < n ) {              //schleife fuer baumstamm

                        
                        while (counter2 < zaehlerLeer) {
                        
                            System.out.print(" ");
                            counter2++;

                        }


                        counter2 = 0;



                        while (counter2 < zaehlerSterne) {
                            
                            System.out.print("*");
                            counter2++;
                            
                        }


                        counter2 = 0;

                        counter1++;
                        System.out.println("");

                    }

    }
}

//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//***************
//      ***
//      ***
//      ***