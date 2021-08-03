package cwiczenia31do60.cwicz33;

public class NotebookShop {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addToArray(new Computer("Ibm", 1));
        dataStore.addToArray(new Computer("Asus", 2));
        dataStore.addToArray(new Computer("Apple", 3));
        dataStore.addToArray(new Computer("MAC", 4));
        dataStore.addToArray(new Computer("Apple", 3));

        System.out.println("Lista komputerów");
        dataStore.printListOfComputers();
        Computer compToFind = new Computer("Apple", 3);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);
    }
}
