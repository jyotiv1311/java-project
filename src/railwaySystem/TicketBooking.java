package railwaySystem;

import java.util.Scanner;

public class TicketBooking {
    
    public void bookTicket(int seatNo){
     
        Scanner scan = new Scanner(System.in);
        System.out.println("enter type of seat (window/aisle/middle/any) : ");
       String type = scan.nextLine();
       Type seattype = Type.valueOf(type.toUpperCase());

       boolean rotatingSeat=false;
       boolean isac = false;
       boolean meal = false;
       boolean windowView = false;

        switch (seattype) {
            case WINDOW:
             System.out.println("Include Meal (True/False) : ");
              meal = scan.nextBoolean();
             System.out.println("Window View (True/False) : ");
              windowView = scan.nextBoolean();
            break;
            case MIDDLE:
            System.out.println("AC (True/False) : ");
            isac = scan.nextBoolean();
            System.out.println("Include Meal (True/False) : ");
            meal = scan.nextBoolean();
                break;
            case AISLE:
             System.out.println("rotating seat (True/False) : ");
             rotatingSeat = scan.nextBoolean();
             System.out.println("AC (True/False) : ");
             isac = scan.nextBoolean();
             System.out.println("Include Meal (True/False) : ");
             meal = scan.nextBoolean();
                break;   
            case ANY:
             System.out.println("Include Meal (True/False) : ");
             meal = scan.nextBoolean();
                break; 
            default:
            System.out.println("Invalid choice.");
                break;
        }

        SeatCharacterstics sc = new SeatCharacterstics(type, rotatingSeat, isac, meal,windowView);

         boolean seats[] =  TotalSeats.allSeats;

       if(seatNo<1 || seatNo>seats.length){
        System.out.println("Invalid seat number.");
       }
       else if(seats[seatNo-1]){
        seats[seatNo-1] = false;
        System.out.println("Ticket booked successfully for " + sc.getType() + " seat " + seatNo);
        System.out.println("Characterstics : ");
        System.out.println("Rotating Seat : "+(rotatingSeat? "Yes" : "No"));
        System.out.println("AC : "+(isac? "Yes" : "No"));
        System.out.println("Meal : "+(meal? "Yes" : "No"));
        System.out.println("Window View : "+(windowView? "Yes" : "No"));
       }else{
        System.out.println("seat "+seatNo+" is not available");
       }
       
    }
}
