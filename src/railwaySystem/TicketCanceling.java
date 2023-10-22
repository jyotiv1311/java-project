package railwaySystem;

public class TicketCanceling extends TotalSeats{
    public void cancelTicket(int seatNo,String seatType){
    
        boolean seats[]=null;
        
        if(seatType.equalsIgnoreCase("window")){
            seats = TotalSeats.windowSeat;
        }else if(seatType.equalsIgnoreCase("middle")){
            seats = TotalSeats.middleSeat;
        }else if(seatType.equalsIgnoreCase("aisle")){
            seats = TotalSeats.aisleSeat;
        }else{
            System.out.println("invalid seat type.");
        }
       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       if(!seats[seatNo-1]){
        seats[seatNo-1] = true;
        System.out.println("Ticket cancel successfully for " + seatType + " seat " + seatNo);
       }else{
        System.out.println("seat "+ seatNo + " is already available");
       }
       
    }
}
