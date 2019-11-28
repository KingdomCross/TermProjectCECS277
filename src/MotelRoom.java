import java.util.ArrayList;

public class MotelRoom {
	//private boolean DoNotDisturb = false;
    public MotelRoom getPlan(RoachColony rc, String room, ArrayList Amenities ){  
   
        if(room == null){  
         return null;  
        }  
      if(room.equalsIgnoreCase("Regular")) {  
             return new Regular(Amenities);  
           }   
       else if(room.equalsIgnoreCase("Deluxe")){  
            return new Deluxe(Amenities);  
        }   
      else if(room.equalsIgnoreCase("Suite")) {  
            return new Suite();  
      }  
  return null;  
}  
    public void setDoNotDisturb() {
    }
}
