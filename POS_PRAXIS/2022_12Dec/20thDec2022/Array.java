import java.util.ArrayList;

public class Array {

    public static void main ( String[] args ) {

        String question1 = "What is your Birthday?";
        Strinuestion2 = "What is your name?";
        String question3 = "What's your favorite movie?";

        String answer1  = "26th of August";
        String answer2  = "djfdkfgdf";
        String answer3  = "Idk";


        String[] questions = new String[3];
        questions[0] = question1;
        questions[1] = question2;
        questions[2] = question3;

        String[] answers = new String[3];
        answers[0] = answer1;
        answers[1] = answer2;
        answers[2] = answer3;

        //ArrayIndexOutOfBoundsException
        // System.out.println(questions[3]);
        //wont work! Index is numbers 0,1,2

        //to find array length:
        System.out.println(questions.length); //ohne () ? ? ?? 

        System.out.println("\n" + "Arrayausgabe");
        for (int i = 0; i < 3; i++) {
            System.out.println("Question " + i + ": " + questions[i]);
            System.out.println("Question " + i + ": " + answers[i]);
        }


        String[] cartoons = {"SU", "TOH", "ATLA", "OK.KO", ""};
        for (String i : cartoons) {
            System.out.println(i);
        }

        System.out.println("\n" + "ArrayList<String>");
        ArrayList<String> notizen = new ArrayList<String>();
        notizen.add("Brot kaufen", "Handy aufladen", "11:30 Jane Doe treffen");
        for (String i : notizen) {
            System.out.println(i);
        }




    }
}