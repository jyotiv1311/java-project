package railwaySystem;

public class TicketCanceling extends TotalSeats{
    public void cancelTicket(int seatNo){
    
       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       if(!seats[seatNo-1]){
        seats[seatNo-1] = true;
        System.out.println("ticket cancel for "+seatNo+" seat number");
       }else{
        System.out.println("seat "+ seatNo + " is already available");
       }
       
    }
}
