package chapterfive.techsupportV1;

import java.util.*;

public class Responder {

    private Random random ;
    private HashMap<String, String> responses;
    ArrayList<String> defaultResponses;

    public Responder(){
        this.random = new Random();
        this.responses = new HashMap<>();
        this.defaultResponses = new ArrayList<>();
        fillResponses();
        fillDefaultResponses();
    }

    public String generateResponse(HashSet<String> words){
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            String word = it.next();
            String response = responses.get(word);
            if(response != null){
                return response;
            }
        }

        return pickDefaultResponse();

    }

    private void fillResponses()
    {
        responses.put("crash",
                "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responses.put("crashes",
                "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responses.put("slow",
                "I think this has to do with your hardware. Upgrading your processor\n" +
                        "should solve all performance problems. Have you got a problem with\n" +
                        "our software?");
        responses.put("performance",
                "Performance was quite adequate in all our tests. Are you running\n" +
                        "any other processes in the background?");
        responses.put("bug",
                "Well, you know, all software has some bugs. But our software engineers\n" +
                        "are working very hard to fix them. Can you describe the problem a bit\n" +
                        "further?");
        responses.put("buggy",
                "Well, you know, all software has some bugs. But our software engineers\n" +
                        "are working very hard to fix them. Can you describe the problem a bit\n" +
                        "further?");
        responses.put("windows",
                "This is a known bug to do with the Windows operating system. Please\n" +
                        "report it to Microsoft. There is nothing we can do about this.");
        responses.put("macintosh",
                "This is a known bug to do with the Mac operating system. Please\n" +
                        "report it to Apple. There is nothing we can do about this.");
        responses.put("expensive",
                "The cost of our product is quite competitive. Have you looked around\n" +
                        "and really compared our features?");
        responses.put("installation",
                "The installation is really quite straight forward. We have tons of\n" +
                        "wizards that do all the work for you. Have you read the installation\n" +
                        "instructions?");
        responses.put("memory",
                "If you read the system requirements carefully, you will see that the\n" +
                        "specified memory requirements are 1.5 giga byte. You really should\n" +
                        "upgrade your memory. Anything else you want to know?");
        responses.put("linux",
                "We take Linux support very seriously. But there are some problems.\n" +
                        "Most have to do with incompatible glibc versions. Can you be a bit\n" +
                        "more precise?");
        responses.put("bluej",
                "Ahhh, BlueJ, yes. We tried to buy out those guys long ago, but\n" +
                        "they simply won't sell... Stubborn people they are. Nothing we can\n" +
                        "do about it, I'm afraid.");
    }

    private void fillDefaultResponses()
    {
        defaultResponses.add("That sounds odd. Could you describe that problem in more detail?");
        defaultResponses.add("No other customer has ever complained about this before. \n" +
                "What is your system configuration?");
        defaultResponses.add("That sounds interesting. Tell me more...");
        defaultResponses.add("I need a bit more information on that.");
        defaultResponses.add("Have you checked that you do not have a dll conflict?");
        defaultResponses.add("That is explained in the manual. Have you read the manual?");
        defaultResponses.add("Your description is a bit wishy-washy. Have you got an expert\n" +
                "there with you who could describe this more precisely?");
        defaultResponses.add("That's not a bug, it's a feature!");
        defaultResponses.add("Could you elaborate on that?");
    }

    public String pickDefaultResponse(){
        int index = random.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }

}
