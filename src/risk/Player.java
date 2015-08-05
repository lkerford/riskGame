package risk;

import java.util.ArrayList;

public class Player {
  private String name;
  private int orderOfPlay;
 private Cash cash;
  private ArrayList<Territory> territories; 
  private boolean newTrade;
  private boolean newTreaty;
  private ArrayList<Treaties> agreaments;
  
  public Player(){
    orderOfPlay =1;
    name = "player" + orderOfPlay;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
    newTrade = false;
    newTreaty = false;
    agreaments = new ArrayList<Treaties>();
  }

  
  public Player(int order){
    orderOfPlay =order;
    name = "player" + orderOfPlay;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
    newTrade = false;
    newTreaty = false;
    agreaments = new ArrayList<Treaties>();
  }
  public Player(String name){
    orderOfPlay =0;
    this.name = name;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
    agreaments = new ArrayList<Treaties>();
  }
  public Player(String name, int order){
    orderOfPlay =order;
    this.name = name;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
    agreaments = new ArrayList<Treaties>();
  }
  
  public String getName(){
    return name;
  }
  
  public int getOrder() {
    return orderOfPlay;
  }
    
  public void changeName(String newName){
    name = newName;
  }
  public Cash getCash(){
    return cash;
  }
  public void acquireTerritory(Territory t){
    territories.add(t);
    t.addOwner(this);
  }
  public void removeTerritory(Territory t){
    territories.remove(t);
  }
 public void newTreaty(boolean state){
   newTreaty = state;
 }
 public boolean getNewTreaty(){
   return newTreaty;
 }
 
 public ArrayList<Treaties> getTreaties(){
   return agreaments;
 }
 
 public void addTreaty(Treaties t){
   agreaments.add(t);
 }
 public void removeTreaty(Treaties t){
   agreaments.remove(t);
 }
}

