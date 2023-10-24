package railwaySystem;

public class CheckSeatAvailable {
   
    public void checkAvailability(){

        boolean seats[] = TotalSeats.allSeats;


        System.out.println("Seat status : ");
        for(int i=0;i<seats.length;i++){
            System.out.println("Seat "+ (i+1) +":"+ ( seats[i]? "Available" : "Booked"));
        }
    }
}
