package risk;

public class Units {
  private Territory location;
  private int movableUnits; 
  private int movedThisTurn;
  private int numberOfUnits;
  
  public Units(Territory loc){
    location = loc;
    movableUnits = 1; //how far can a unit move
    movedThisTurn =0;
    numberOfUnits =1;
  }
  
  Territory getLocation(){
    return location;
  }
 
    public boolean canMove(Territory destination){
      return   location.getNeighbour().contains(destination) && movedThisTurn != movableUnits;
      
    }
   
   void move(Territory destination){
     location = destination;
   }
   
   public void changeSize(int s){
     numberOfUnits += s;
   }
   
   public int getSize(){
     return numberOfUnits;
   }
}
