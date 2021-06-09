package chapterthree.mailsystem;

public class MailItem {

    private String from;
    private String to;
    private String subject;
    private String message;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public MailItem(String from, String to, String subject, String message){
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
    }

    public void print(){
        System.out.println("From: " + from);
        System.out.println("To:" + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}
