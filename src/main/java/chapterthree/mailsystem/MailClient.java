package chapterthree.mailsystem;

public class MailClient {

    private MailServer server;
    private String user;

    public MailClient(MailServer server, String user){
        this.server = server;
        this.user = user;
    }

    public MailItem getNextItem(){
        return server.getNextMailItem(user);
    }

    public void printNextMailItem(){
        MailItem item = server.getNextMailItem(user);
        if (item == null){
            System.out.println("No new mail");
        }
        else {
            item.print();
        }
    }

    public void sendMailItem(String to, String subject, String message){
        MailItem item = new MailItem(user, to, subject, message);
        server.post(item);
    }
}
