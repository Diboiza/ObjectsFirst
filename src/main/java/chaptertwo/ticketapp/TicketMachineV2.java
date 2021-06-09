package chaptertwo.ticketapp;

public class TicketMachineV2 {

    private int price;
    private int balance;
    private int total;

    public TicketMachineV2(String destination){
        if(destination.equals("sandton")){
            price = 300;
        }
        else if(destination.equals("soweto")){
            price = 400;
        }

        balance = 0;
        total = 0;
    }

    public int getPrice(){
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public void insertMoney(int money){
        balance = balance + money;
    }

    public void printTicket(){


    }

}