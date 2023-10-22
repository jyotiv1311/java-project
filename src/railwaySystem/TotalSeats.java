package railwaySystem;

public class TotalSeats {
    
    public static boolean seats[];

    public static void initializeSeats(int seatNumbers){

        seats = new boolean[seatNumbers];
        for(int i=0;i<seatNumbers;i++){
            seats[i]=true;
        }
    }
}
