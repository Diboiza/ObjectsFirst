package chaptertwo.ticketapp;

public class BuyTicket {
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine(500);

        System.out.println(ticketMachine.getPrice());
        ticketMachine.insertMoney(200);
        ticketMachine.printTicket();
        ticketMachine.insertMoney(400);
        ticketMachine.printTicket();
        System.out.println(ticketMachine.refundBalance());
    }
}
