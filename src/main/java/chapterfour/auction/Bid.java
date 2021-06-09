package chapterfour.auction;

public class Bid {

    //Object declarations for the Person and the amount they will bid
    private final Person bidder;
    private final Long bidAmount;

    public Bid(Person bidder, Long bidAmount) {
        this.bidder = bidder;
        this.bidAmount = bidAmount;
    }

    public Person getBidder() {
        return bidder;
    }

    public Long getBidAmount() {
        return bidAmount;
    }
}
