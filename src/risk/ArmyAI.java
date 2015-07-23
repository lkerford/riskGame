package risk;

import java.util.ArrayList;
import java.util.Random;

public class ArmyAI {
  private ArrayList<Army> armies;
  
  public ArmyAI(){
    armies = new ArrayList<Army>();
  }
  private void addArmy(Army toAdd){
    armies.add(toAdd);
  }
  public void newArmy(Player player){
    addArmy(new Army(player));
  }
  public void moveUnit(Territory destination, Units unit, Player player){
   
    if(unit.canMove(destination))
    {
      if(destination.getState()){
        unit.move(destination);
      }
      else if(armies.get(player.getOrder() -1).getPlayer() == destination.getPlayer()){
        unit.move(destination);
      }
      else{
        if(fight(unit,destination.getOccupant())){
          
        }
        else{
          
        }
      }
    }
  }
  
  private Boolean fight(Units attacker, Units defendant){
    Random r = new Random();
    int attackerRole; 
    int defendantRole; 
    while(true){
      attackerRole = r.nextInt(7) + 1; 
      defendantRole = r.nextInt(7) + 1; 
      if(attackerRole +  attacker.getSize() > defendantRole + defendant.getSize()){
        return true;
      }
      else if(attackerRole +  attacker.getSize() < defendantRole + defendant.getSize()){
        return  false;
      }
    }
   
  }
}

