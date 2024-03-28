import java.util.Scanner;

public class Ticket {
    public void bookTicket() {
        int availableStock = MovieTicketAPP.getAvailableStock();

        if (availableStock == 0) {
            System.out.println("Sorry, no tickets available.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tickets you want to book: ");
        int numTickets = scanner.nextInt();

        if (numTickets > availableStock) {
            System.out.println("Sorry, only " + availableStock + " tickets available.");
            return;
        }

        double totalPrice = numTickets * MovieTicketAPP.ticketPrice;
        System.out.println("Total Price: $" + totalPrice);

        System.out.println("Confirm booking? (yes/no)");
        String confirmation = scanner.next();

        if (confirmation.equalsIgnoreCase("yes")) {
            MovieTicketAPP.decreaseAvailableStock(numTickets);
            MovieTicketAPP.ticketCounter++;
            System.out.println("Tickets booked successfully!");
            System.out.println("Ticket ID: " + generateTicketID());
        } else {
            System.out.println("Booking cancelled.");
        }
    }

    private String generateTicketID() {
        return "TICKET-" + MovieTicketAPP.ticketCounter;
    }
}

// Chat GPT Still Too Much Helped me in this exercise, i still need time for understanding OOP, i will create my full version later sir