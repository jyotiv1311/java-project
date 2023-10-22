package railwaySystem;

import java.util.Scanner;

class RailwaySystem {

    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking();
        TicketCanceling tc = new TicketCanceling();
        CheckSeatAvailable ca = new CheckSeatAvailable();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of seats : ");
         int numSeats = sc.nextInt();
       TotalSeats.initializeSeats(numSeats);

        while (true) {
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a ticket");
            System.out.println("3. Check seat availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                      System.out.println("enter seat number you want to book : ");
                      int seatBook = sc.nextInt();
                      tb.bookTicket(seatBook);
                    break;
                case 2:
                      System.out.println("enter seat number you want to cancel : ");
                      int seatCancel = sc.nextInt();
                      tc.cancelTicket(seatCancel);
                      break;
                case 3:
                    ca.checkAvailability();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    }
