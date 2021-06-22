package chapterfive.techsupportV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Responder {

    private Random random ;
    private HashMap<String, String> responses;

    public Responder(){
        this.random = new Random();
        this.responses = new HashMap<>();
    }

    public String generateResponse(String word){
        //pick a random number for the index in the default response list
        String response = responses.get(word);
        if(response != null){
            return response;
        }
        else {
            int index = random.nextInt(responses.size());
            return responses.get(index);
        }
    }

    public void fillResponses(){
        responses.put("slow","I think this has to do with your hardware \n" +
                "upgrading your processor should solve all your problems");
        responses.put("bug","Well you know all softwares have bugs \n" +
                "but we are working hard to fix that?");
        responses.put("Expensive","What isn't expensive though");

    }

}
