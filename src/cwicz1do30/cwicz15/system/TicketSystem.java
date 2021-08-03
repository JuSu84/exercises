package cwicz1do30.cwicz15.system;

import cwicz1do30.cwicz15.model.Client;
import cwicz1do30.cwicz15.model.MovieShow;
import cwicz1do30.cwicz15.model.Ticket;

public class TicketSystem {


    Ticket createTicket( MovieShow movieShow, Client client) {
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (!clientHasRequiredAge(movieShow, client)) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeats();
            return new Ticket(ticketId, client, movieShow);
        }
    }

    private int generateNextTicketId(MovieShow movieShow) {
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAge(MovieShow movieShow, Client client) {
        return client.getAge() >= movieShow.getAgeRequired();
    }
}
