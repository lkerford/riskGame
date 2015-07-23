package risk;

import java.util.ArrayList;

public class Army {
  private ArrayList<Units> units;   
  private Player owner;
  
  public Army(Player player){
    units = new ArrayList<Units>();
    owner = player;
  }
  
  public ArrayList<Units> getUnits(){
    return units;
  }
  
  public void addUnit(Units addUnit){
    units.add(addUnit);
  }
  
  public void removeUnit(Units removeUnit){
   units.remove(removeUnit);
  }
  
  public Boolean occupies(Territory loc){
    for (Units unit : units){
      if(unit.getLocation() == loc){
        return true;
      }
    }
    return false; 
  }
  
  public Player getPlayer(){
    return owner;
  }
}
