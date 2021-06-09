package chapterfour.auction;

public class Lot {
    private int lotNumber;
    private String lotDescription;
    private Bid highestBid;

    public Lot(int lotNumber, String lotDescription) {
        this.lotNumber = lotNumber;
        this.lotDescription = lotDescription;
        this.highestBid = null;
    }

    /**
     * Attempt to bid for the lot, the bid amount
     * must be higher than current highest bid
     *
     * @param bid bidAmount
     * @return true if succesful, false otherwise
     */

    public boolean bidFor(Bid bid) {
        if (highestBid == null || bid.getBidAmount() > highestBid.getBidAmount()) {
            highestBid = bid;
            return true;
        } else {
            return false;
        }
    }

    /**
     * print the details of the lot
     * @return details with highest bid amount if not null
     * no bid if highestValue is null
     */
    public String getLotDetails() {
        String details = lotNumber + ": " + lotDescription;
        if (highestBid != null) {
            details += " bid: R" + highestBid.getBidAmount();
        } else {
            details += " No bid";
        }
        return details;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public String getLotDescription() {
        return lotDescription;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

}
