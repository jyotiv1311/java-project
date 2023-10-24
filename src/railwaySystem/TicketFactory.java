package railwaySystem;

public class TicketFactory {
    public static TicketBooking createTicketBooking() {
        return new TicketBooking();
    }

    public static TicketCanceling createTicketCanceling() {
        return new TicketCanceling();
    }

    public static CheckSeatAvailable createCheckSeatAvailable() {
        return new CheckSeatAvailable();
    }
}
