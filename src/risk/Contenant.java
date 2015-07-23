package risk;

import java.util.ArrayList;
 
public class Contenant {
  String name;
  ArrayList<Territory> members;
  
  public Contenant(String n){
     name = n;
     members = new ArrayList<Territory>();
   }
  
  public void addTerritory(Territory t){
   if(members.indexOf(t) == -1){
    members.add(t);
   }
  }
}
