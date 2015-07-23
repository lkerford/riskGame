package risk;

import java.util.ArrayList;

public class Player {
  String name;
  int orderOfPlay;
  Army army;
  int cash;
  ArrayList<Territory> territories; 
  
  public Player(){
    orderOfPlay =1;
    name = "player" + orderOfPlay;
    
  }

  
  public Player(int order){
    orderOfPlay =order;
    name = "player" + orderOfPlay;
    
  }
  public Player(String name){
    orderOfPlay =0;
    this.name = name;
    
  }
  public Player(String name, int order){
    orderOfPlay =order;
    this.name = name;
    
  }
  
  String getName(){
    return name;
  }
  
  int getOrder() {
    return orderOfPlay;
  }
  
  int getCash(){
    return cash;
  }
  
  void changeName(String newName){
    name = newName;
  }
  void changeCash(int modCash){
    cash += modCash;
  }
  
  public void proposeTrade(Player otherPlayer, int cash){
    
  }
}
