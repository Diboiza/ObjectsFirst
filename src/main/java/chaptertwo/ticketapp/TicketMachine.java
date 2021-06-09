package chaptertwo.ticketapp;

public class TicketMachine {

    private int balance;
    private int price;
    private int total;


    public TicketMachine(int ticketCost){
        this.price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getBalance() {
        return balance;
    }


    public int getPrice() {
        return price;
    }

    public void insertMoney(int amount){

        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount: " + amount);
        }
    }

    public void printTicket(){

        int amountLeftToPay = balance - price;
        if(amountLeftToPay <= 0) {
            System.out.println("############################\n" +
                    "##The Dube Express Line##\n" +
                    "##        Ticket       ##\n" +
                    "#         R" + price + "          #\n" +
                    "###########################");
            total = total + balance;
            balance = balance - price;
        }
        else{
            System.out.println("You must insert at least: R" +
                    (price - balance) + " more to purchase a ticket");
        }
    }

    private int emptyMachine(){
        total = 0;
        return total;
    }

    public int refundBalance(){
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;

    }
}