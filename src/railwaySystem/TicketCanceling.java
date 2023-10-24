package railwaySystem;

public class TicketCanceling {
    public void cancelTicket(int seatNo){
    
        boolean seats[] = TotalSeats.allSeats;

       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       if(!seats[seatNo-1]){
        seats[seatNo-1] = true;
        System.out.println("Ticket cancel successfully for " + seatNo);
       }else{
        System.out.println("seat "+ seatNo + " is already available");
       }
       
    }
}
