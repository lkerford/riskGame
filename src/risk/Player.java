package risk;

import java.util.ArrayList;

public class Player {
  String name;
  int orderOfPlay;
  Army army;
  Cash cash;
  ArrayList<Territory> territories; 
  
  public Player(){
    orderOfPlay =1;
    name = "player" + orderOfPlay;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
  }

  
  public Player(int order){
    orderOfPlay =order;
    name = "player" + orderOfPlay;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
  }
  public Player(String name){
    orderOfPlay =0;
    this.name = name;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
  }
  public Player(String name, int order){
    orderOfPlay =order;
    this.name = name;
    cash = new Cash();
    territories = new  ArrayList<Territory>();
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
}
