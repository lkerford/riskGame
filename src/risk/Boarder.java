package risk;

public class Boarder {
  Territory territory1;
  Territory territory2;
  
      public Boarder(Territory left, Territory right){
        territory1 = left;
        territory2 = right;
      }
      
      public Territory[] getTerritory(){
        Territory[] temp = {territory1,territory2};
        return temp;
      }
}
