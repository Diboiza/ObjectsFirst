package chapterfour.auction;

public class BidAtAuction {


    public static void main(String[] args) {

        Person bongani = new Person("Bongani");
        Person dani = new Person("Dani");
        Person dani2 = new Person("Dani");
        String[] standardBankList = {"Audi-S3", "C63", "V250", "Wrangler", "RSQ8"};
        Auction auction = new Auction();

        for (String car: standardBankList){
            auction.enterLot(car);
        }

        auction.showAllItemsOnAuction();

        auction.makeABid(1,dani, 350000);
        auction.makeABid(2,bongani,450000);
        auction.makeABid(4,dani2,74000);
        auction.makeABid(3,bongani,350000);
        auction.showAllItemsOnAuction();

        auction.close();
        for (Lot item:auction.getUnsoldItems()) {
            System.out.println("Unsold: " + item.getLotDescription());
        }

        System.out.println(auction.removeLot(2));
    }

}
