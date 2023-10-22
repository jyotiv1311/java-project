package railwaySystem;

public class CheckSeatAvailable extends TotalSeats{
    
    public void checkAvailability(String seatType){

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


        System.out.println("Seat status");
        for(int i=0;i<seats.length;i++){
            System.out.println("Seat "+ (i+1) +":"+ ( seats[i]? "Available" : "Booked"));
        }
    }
}
