package cwicz1do30.cwicz15.system;

import cwicz1do30.cwicz15.model.Client;
import cwicz1do30.cwicz15.model.MovieShow;
import cwicz1do30.cwicz15.model.Ticket;

class CinemaSystem {
    public static void main(String[] args) {

        MovieShow movieShow = new MovieShow("Omen", "horror", 128, 16, 72, 72);

        Client client1 = new Client("Jan", "Kowalski", 15);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movieShow, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketSystem.createTicket(movieShow, client2);

        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movieShow.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: "
                + (movieShow.getMaxSeats() - movieShow.getFreeSeats()));
    }
}