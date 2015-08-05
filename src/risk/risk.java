package risk;

public class risk {

 //initialization phase
 /* this is a test script
  * 
  */
  public static void main(String [ ] args){
  Map map = new Map();
  Territory alberta = new Territory("Alberta");
  Territory  sas = new Territory("Sas");
  Territory  bc = new Territory("bs");
  Territory test = new Territory("Alberta");
  Territory testNeighbour = new Territory("BC");
  Territory testNbc = new Territory("bc");
  Territory saseighbour2 = new Territory("NFL");
  
  alberta.addNeighbour(bc);
  alberta.addNeighbour(test);
  alberta.addNeighbour(testNbc);
  
  sas.addNeighbour(saseighbour2);
  testNeighbour.addNeighbour(testNbc);
  System.out.println(alberta.getName());
  map.addTerritory(alberta);
  map.addTerritory(sas);
  map.addTerritory(bc);
  map.addTerritory(test);
  map.addTerritory(testNeighbour);
  map.addTerritory(testNbc);
  map.addTerritory(saseighbour2);

 
  
// create territries 
  // create territories ai
  // create players
  // create armie for each player
  
// start play phase
  // start with player 1 to pick a territory 
  //until no territories left
  
//player one start turn
  //accept of decline treaties and trades
  
  
  //can add units
  //can move units 
  //can attack
  //can offer treaty
  //can offer trade
  
//attack phase
  
  
  //move units 
  
}
}
