package chapterfive.techsupportV1;

import java.util.ArrayList;
import java.util.Random;

public class Responder {

    Random random ;
    ArrayList<String> responses;

    public Responder(){
        this.random = new Random();
        this.responses = new ArrayList<>();
    }

    public String generateResponse(){
        //pick a random number for the index in the default response list
        int index = random.nextInt(responses.size());
        return responses.get(index);
    }

    public void fillResponses(){
        responses.add("That sounds odd. could you describe \n" +
                "your problem in more detail?");
        responses.add("No other customer has ever complained about this \n" +
                "What is your system config?");
        responses.add("That sounds interesting..tell me more.");
        responses.add("I need a bit information on that.");
        responses.add("Have you checked that you do not have a DLL conflict?");
        responses.add("That is explained in the manual \n" +
                "Have you read the manual?");
        responses.add("Your description is a bit wishy-washy \n" +
                "describe it in a different way?");
        responses.add("That's not a bug it's a feature");
        responses.add("could you elaborate on that?");
    }

}
