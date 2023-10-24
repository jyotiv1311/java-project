package railwaySystem;

public class SeatCharacterstics {

 private String seatType;
 private boolean rotatingSeat;
 private boolean ac;
 private boolean meal;
 private boolean window_view;
  
        SeatCharacterstics(String seatType,boolean rotatingSeat,boolean ac,boolean meal,boolean window_view){
            this.seatType = seatType;
            this.rotatingSeat = rotatingSeat;
            this.ac = ac;
            this.meal = meal;
            this.window_view = window_view;
        }
        public String getType() {
            return seatType;
        }
    
        public boolean hasRotatingSeat() {
            return rotatingSeat;
        }
    
        public boolean isAC() {
            return ac;
        }
    
        public boolean includesMeal() {
            return meal;
        }
         public boolean isWindowView() {
            return window_view;
        }


}
