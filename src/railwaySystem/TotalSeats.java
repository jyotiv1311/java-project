package railwaySystem;

public class TotalSeats {
    
    public static boolean windowSeat[];
     public static boolean middleSeat[];
      public static boolean aisleSeat[];

    public static void initializeSeats(int seatNumbers){

        windowSeat = new boolean[seatNumbers];
         middleSeat = new boolean[seatNumbers];
          aisleSeat = new boolean[seatNumbers];
        for(int i=0;i<seatNumbers;i++){
            windowSeat[i]=true;
             middleSeat[i]=true;
              aisleSeat[i]=true;
        }
    }
}
