package risk;

import java.util.ArrayList;
import java.util.Collections;

public class Territory extends GameObject {
  private String name;
  private ArrayList<Territory> neighbours;
  private Player owner; 
  private Boolean occupied;
  private Units units; 
  private Player occupantPlayer;
  private boolean underTreaty;
  private ArrayList<Integer> treaties;
  
  public Territory(String name){
    this.name = name;
    neighbours = new ArrayList<Territory>();
    occupied = false;
    underTreaty = false;
    treaties = new ArrayList<Integer>();
    
  }
  public String getName(){
    return name;
  }
  public Boolean getState(){
    return occupied;
  }
  public Units getOccupant(){
    return units;
  }
  public Player getOwner(){
    return owner;
  }
  public ArrayList<Territory> getNeighbour(){
    return neighbours;
  }
  
  public void addOwner(Player player){
    owner = player;
  }
  
  public void occupation(Boolean state, Units unit, Player player){
    occupied = state;
    occupantPlayer = player;
    units = unit;
  }
  public Player getPlayer(){
    return occupantPlayer;
  }
  public  void addNeighbour(Territory neigh){
    neighbours.add(neigh);
  }
  
  public void modifyTreatyState(boolean state, Treaties treaty){
    underTreaty = state;
    treaties.add(treaty.getIndex());
    Collections.sort(treaties);
  }
  public void removeTreaty(Treaties treaty){
   treaties.remove(treaty.getIndex());
  }
  
  public boolean getTreaty(){
    return underTreaty;
  }
  public ArrayList<Integer> getTreaties(){
    return treaties;
  }
}
