package cwicz1do30.Cwiczenie4;

public class AuctionFactory {

    Auction createAuction(String title, String description, double price, Person seller ){
        Auction auction = new Auction();
        auction.title = title;
        auction.description = description;
        auction.price = price;
        auction.seller = seller;
        return auction;
    }


}
