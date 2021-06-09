package chapterfour.auction;

import java.util.ArrayList;
import java.util.Iterator;

public class Auction {

    private ArrayList<Lot> lots;
    private int nextLotNumber;

    public Auction() {
        lots = new ArrayList<>();
        nextLotNumber = 0;
    }

    public void enterLot(String description){
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    public void showAllItemsOnAuction(){
        for (Lot lot: lots) {
            System.out.println(lot.getLotDetails());
        }
    }

    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     *
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param bidAmount The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long bidAmount){
        Lot selectedLot = getLot(lotNumber);

        if(selectedLot != null){
            Bid bid = new Bid(bidder,bidAmount);
            boolean succesful = selectedLot.bidFor(bid);
            if(succesful){
                System.out.println("The bid for lot number: "+
                        lotNumber + " was succesful");
            }
            else {
                Bid highestbid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                        " already has a bid for: R" + highestbid.getBidAmount());
            }
        }

    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            // Include a confidence check to be sure we have the
            // right lot.
            if(lots.contains(lotNumber)) {
                System.out.println("Internal error: Lot number " +
                        " was returned instead of " +
                        lotNumber);
                // Don't return an invalid lot.
                return lots.get(lotNumber);
            }
            return lots.get(lotNumber);
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                    " does not exist.");
            return null;
        }
    }

    /**
     * method to print the details of all lots
     */

    public void close(){
        Iterator<Lot> it = lots.iterator();
        while (it.hasNext()){
            Lot currentLot = it.next();
            if(currentLot.getHighestBid() != null){
                System.out.println("Bidder: " + currentLot.getHighestBid().getBidder().getName() +
                        " Sold for: " + currentLot.getHighestBid().getBidAmount());
            }
            else {
                System.out.println("Lot " + currentLot.getLotDescription() +
                        " did not get any bids");
            }
        }
    }

    //return a list of items not bidded for

    public ArrayList<Lot> getUnsoldItems(){
        ArrayList<Lot> unsold = new ArrayList<>();

        for (Lot item:lots) {
            if(item.getHighestBid() == null){
                unsold.add(item);
            }
        }

        return unsold;
    }

    /**
     * remove the lot with a given lot number
     * @param lotNumber the number of the lot to be removed
     * @return the lot with the given lot number, or null
     * if it does not exist
     */

    public Lot removeLot(int lotNumber){
        Lot removedLot;
        if(lots.contains(lotNumber)){
            removedLot = lots.remove(lotNumber);
            return removedLot;
        }
        else {
            return null;
        }

    }
}