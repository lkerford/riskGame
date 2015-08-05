package risk;

import java.util.ArrayList;

public class Map {
    private ArrayList<Territory> territories;
    private ArrayList<Treaties> agreaments;
  
    public Map(){
      territories =null;
      agreaments = null;
    }
    
    public void addTerritory(Territory t){
      territories.add(t);
      return;
    }
    
    public void addTreaty(Treaties t){
      agreaments.add(t);
      return;
    }
    
   public boolean isTreaty(Territory first, Territory second){
     boolean state = false;
     if(first.getTreaty()){
       if(second.getTreaty()){
         return sharesTreaty(first.getTreaties(),second.getTreaties());
       }
     }
     return state;
   }
   
   private boolean sharesTreaty(ArrayList<Integer>first, ArrayList<Integer> second){
     
     first.addAll(second);
     int index1 = first.get(0);
     int index2;
     for(int i = first.get(0);i < Math.ceil(first.size()/2); i++ ){
     index1= first.indexOf(i);
     index2 = first.lastIndexOf(i);
     if(index1 != index2 ){
       return true;
     }
     }
     return false;
   }
}
