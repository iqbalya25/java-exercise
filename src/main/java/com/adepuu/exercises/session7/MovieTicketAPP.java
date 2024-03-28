import java.util.Scanner;

public class MovieTicketAPP {
    public static final double ticketPrice = 10.0;
    private static final int ticketStock = 10;
    private static int availableStock = ticketStock;
    public static int ticketCounter = 0;

    // Method to provide access to availableStock
    public static int getAvailableStock() {
        return availableStock;
    }

    public static void decreaseAvailableStock(int numTickets) {
        availableStock -= numTickets;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Movie Ticket Booking System");

        while (true) {
            System.out.println("Available Stock: " + getAvailableStock());
            System.out.println("Ticket Price: $" + ticketPrice);
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Ticket bookTicket = new Ticket();
                    bookTicket.bookTicket();
                    break;
                case 2:
                    System.out.println("Thank you for using our Movie Ticket Booking System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}

// Chat GPT Still Too Much Helped me in this exercise, i still need time for understanding OOP, i will create my own full version later sir