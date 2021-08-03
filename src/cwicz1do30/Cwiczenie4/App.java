package cwicz1do30.Cwiczenie4;

public class App {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        AuctionFactory auctionFactory = new AuctionFactory();

        Person person1 = personFactory.createPerson("Jan", "Kowalski");
        Person person2 = personFactory.createPerson("Justyna", "Adamczyk");


//        Address address = new Address();
//        address.street = "Kościuszki";
//        address.home = "24A";
//        address.flat = 21;
//        address.city = "Wrocław";
//        address.postCode = "50-500";

        Auction auction1 = auctionFactory.createAuction("Xbox One",
                "Konsola dla wymagających graczy", 999.99, person1);

        Auction auction2 = auctionFactory.createAuction("Samsung S20", "Niesamowity telefon",
                3999, person2);


        System.out.println(auction1);
        System.out.println(auction2);
        person1.printInfo();
        auction1.printInfo();
    }
}
