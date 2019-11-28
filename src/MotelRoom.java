public class MotelRoom {
    public MotelRoom getPlan(String room){  
        if(room == null){  
         return null;  
        }  
      if(room.equalsIgnoreCase("Regular")) {  
             return new Regular();  
           }   
       else if(room.equalsIgnoreCase("Deluxe")){  
            return new Deluxe();  
        }   
      else if(room.equalsIgnoreCase("Suite")) {  
            return new Suite();  
      }  
  return null;  
}  
    public void setDoNotDisturb() {
    }
}
