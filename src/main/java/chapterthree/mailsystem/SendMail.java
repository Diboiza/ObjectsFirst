package chapterthree.mailsystem;

public class SendMail {

    public static void main(String[] args) {
        MailServer mailServer = new MailServer();
        MailClient bongza = new MailClient(mailServer, "Bongza");
        MailClient dani = new MailClient(mailServer, "Dani");

        bongza.sendMailItem("Dani","My love","Hello punkie");
        dani.printNextMailItem();


    }
}
