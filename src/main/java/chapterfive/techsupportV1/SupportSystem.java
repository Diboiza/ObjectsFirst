package chapterfive.techsupportV1;

import java.util.Random;

/**
 * This class implements a tech support system
 * it is the top level class in this project.
 * the support system communicates via text input/out in the terminal.
 * this class uses an object of class InputReader to read input from the reader
 * and class Responder to generate responses.
 * it contains a loop that repeatedly reads input and generates out
 * until the user wants to quit the program
 * @author: Bongani Maphiri
 * @version 0.1(2021.06.18)
 */

public class SupportSystem {

    private InputReader reader;
    private Responder responder;

    /**
     * create a tech support system constructor
     */

    public SupportSystem(){
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * start the program, this will print a
     * welcome message and enter into a dialog with the user.
     * until the user ends the dialog.
     */

    public void start(){
        boolean finished = false;
        printWelcome();

        Random random = new Random();
        random.nextInt();

//        while (!finished){
//            String input = reader.getInput().trim().toLowerCase();
//
//            if(input.equals("bye")){
//                finished = true;
//
//            }
//            else{
//                String response = responder.generateResponse();
//                System.out.println(response);
//            }
//            printGoodbye();
//        }
    }

    public void printWelcome(){
        System.out.println(
                "Welcome to the BongzaSoft Technical support system.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println(
                "We will assist you with any problem you might have."
        );
        System.out.println("Please type 'bye' to exit the system.");
    }

    public void printGoodbye(){
        System.out.println("Nice talking to you. Bye...");
    }
}
