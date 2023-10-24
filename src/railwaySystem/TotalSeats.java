package railwaySystem;

public class TotalSeats {
    public static boolean allSeats[];

    public static void initializeSeats(int seatNumbers) {
        allSeats = new boolean[seatNumbers];
        for (int i = 0; i < seatNumbers; i++) {
            allSeats[i] = true;
        }
    }
}

