package railwaySystem;

public class TicketBooking extends TotalSeats {
    
    public void bookTicket(int seatNo){
        
       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       else if(seats[seatNo-1]){
        seats[seatNo-1] = false;
        System.out.println("ticket book for "+seatNo+" seat number");
       }else{
        System.out.println("seat "+seatNo+" is not available");
       }
       
    }
}
