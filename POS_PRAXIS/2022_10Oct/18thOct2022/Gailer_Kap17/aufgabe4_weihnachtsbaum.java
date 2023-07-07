import java.util.Scanner;

public class aufgabe4_weihnachtsbaum {

    public static void main ( String[] args ) {

        //ausgabe eines sternenbaums
        //erste reihe 1 stern - letzte reihe 15 sterne
        //dann drei reihen 3 sterne


                int sternAnzahl = 1;
                int leerZeichen = 7;
                int stammLeerZeichen;

                int sternCounter = 0;
                int leerZeichenCounter = 0;

                int zeilen = 0;
                int stammSterne = 3;

                int leerZeichenEingabe;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "------------------------------------------");
        System.out.println("+ * + * + * + Weihnachtsbaum + * + * + * +");
        System.out.println("------------------------------------------" + "\n");



                while (sternAnzahl <= 8) {  //schleife fuer baumBLAETTER whatever


                        while (leerZeichenCounter < leerZeichen) {  //leerzeichen VOR sterne
                            System.out.print(" ");
                            leerZeichenCounter++;
                        }



                        while (sternCounter < sternAnzahl) {        //erste haelfte der sterne LINKS
                            System.out.print("*");
                            sternCounter++;
                        }

                        sternCounter = 0;

                        while (sternCounter < sternAnzahl - 1) {    //zweite haelfte der sterne RECHTS
                            System.out.print("*");
                            sternCounter++;
                        }



                        leerZeichen--;
                        leerZeichenCounter = 0;
                        System.out.println("");
                        sternAnzahl++;
                        sternCounter = 0;


                }



                do {                        //schleife fuer baumSTAMM
                    
                        while (leerZeichenCounter < 6) {    //leerzeichen vor stamm
                            System.out.print(" ");
                            leerZeichenCounter++;
                        }

                        while (sternCounter < 3) {          //sterne die stamm darstellen
                            System.out.print("*");
                            sternCounter++;
                        }

                        leerZeichenCounter = 0;
                        System.out.println("");
                        sternCounter = 0;
                        zeilen++;
 
                } while (zeilen < 3);




        sternAnzahl = 1;
        leerZeichen = 7;

        System.out.println("\n" + "------------------------------------------");
        System.out.print("Wie breit soll ihr Baum sein? (mindestens 7): ");
            leerZeichenEingabe = eingabe.nextInt(); 



        while (leerZeichenEingabe < 7) {

            if (leerZeichenEingabe < 7) {

                System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Falsch! Nur Werte ab mindestens 7 erlaubt!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("\n" + "------------------------------------------");
                System.out.print("Wie breit soll ihr Baum sein?: ");
                    leerZeichenEingabe = eingabe.nextInt(); 
            }

        }  

        System.out.println("");



                while (leerZeichen < leerZeichenEingabe) {      //bestimmung der leerzeichen in erster zeile
                    leerZeichen++;
                }



                while (sternAnzahl <= leerZeichenEingabe) {             //schleife fuer blaetter STERNE


                        while (leerZeichenCounter < leerZeichen) {      //leerzeichen VOR sterne
                            System.out.print(" ");
                            leerZeichenCounter++;
                        }



                        while (sternCounter < sternAnzahl) {            //erste haelfte der sterne LINKS
                            System.out.print("*");
                            sternCounter++;
                        }

                        sternCounter = 0;

                        while (sternCounter < sternAnzahl) {        //zweite haelfte der sterne RECHTS
                            System.out.print("*");
                            sternCounter++;
                        }



                        leerZeichen--;
                        leerZeichenCounter = 0;
                        System.out.println("");
                        sternAnzahl++;
                        sternCounter = 0;


                }


        
                stammLeerZeichen = 6;

                while (stammLeerZeichen < leerZeichenEingabe) {     //baumstamm breite bestimmung
                    stammLeerZeichen++;
                }

                while (stammSterne < leerZeichenEingabe) {
                    stammSterne++;
                }

                

                do {        //schleife fuer baumSTAMM
                        while (leerZeichenCounter < stammLeerZeichen) {     //leerzeichen VOR baumstamm
                            System.out.print(" ");
                            leerZeichenCounter++;
                        }

                        sternCounter = 0;

                        while (sternCounter < stammSterne) {
                            System.out.print("*");
                            sternCounter++;
                        }

                        leerZeichenCounter = 0;
                        System.out.println("");
                        sternCounter = 0;
                        zeilen++;


                } while (zeilen < stammLeerZeichen - 2);



    }

}


//        *
//       ***
//      *****                          ***
//     *******                      *    *
//    *********                          *
//   ***********                    *    *
//  *************                      ***
// ***************
//       ***
//       ***
//       ***

    