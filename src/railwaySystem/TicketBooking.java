package railwaySystem;

public class TicketBooking extends TotalSeats {
    
    public void bookTicket(int seatNo,String seatType){
        boolean seats[]=null;
        
        if(seatType.toLowerCase().equalsIgnoreCase("window")){
            seats = TotalSeats.windowSeat;
        }else if(seatType.toLowerCase().equalsIgnoreCase("middle")){
            seats = TotalSeats.middleSeat;
        }else if(seatType.toLowerCase().equalsIgnoreCase("aisle")){
            seats = TotalSeats.aisleSeat;
        }else{
            System.out.println("invalid seat type.");
        }

       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       else if(seats[seatNo-1]){
        seats[seatNo-1] = false;
        System.out.println("Ticket booked successfully for " + seatType + " seat " + seatNo);
       }else{
        System.out.println("seat "+seatNo+" is not available");
       }
       
    }
}
