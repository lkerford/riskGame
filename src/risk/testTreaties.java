package risk;



public class testTreaties {
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
  
  Player player1 = new Player("me");
  Player player2 = new Player("you");
  Cash c = new Cash(12);
  player1.getCash().changeAmount(20);
  player2.getCash().changeAmount(20);
  
  Treaties testTreat = new Treaties(player1, player2, saseighbour2, sas, c, 2, 0);
  //create treaty

  
  //check new treaty boolean in player
  
  if(!player2.getNewTreaty()){
    System.out.println("failed, no new treaty for player2");
  }
  
  //test acceptance of treaty
  testTreat.respond(true, player2);
  if(!testTreat.getAccepted()){
    System.out.println("fail should treaty should be accepted");
  }
  
  //check treaty is added to players treaties
 if(!player1.getTreaties().contains(testTreat)){
    System.out.println("failed, treaty not found in player1 inventory");
  }  
  
 if(!player2.getTreaties().contains(testTreat)){
   System.out.println("failed, treaty not found in player2 inventory");
 } 
  //test after treaty is accepted it can be unaccepted
 testTreat.respond(false, player2);
 if(!testTreat.getAccepted()){
   System.out.println("fail should treaty should be accepted");
 }
 
   //check only receiving player can accept treaty
 Treaties testTreaty2 = new Treaties(player1,player2,alberta,bc,c,12,1); 
  testTreaty2.respond(true, player1);
  if(testTreaty2.getAccepted()){
    System.out.println("fail should treaty should not be accepted");
  }
//check treaty is removed is unaccepted
  
  testTreaty2.respond(false, player2);
  if(player2.getTreaties().contains(testTreaty2)){
    System.out.println("fail, found unaccepted treaty");
  }
  if(player1.getTreaties().contains(testTreaty2)){
    System.out.println("fail, found unaccepted treaty");
  }
  if(testTreaty2.getActive()){
    System.out.println("fail, treaty should not be active");
  }
  //check turn count changes
  testTreat.modifyTurns();
  if(testTreat.getTurns() != 1){
    System.out.println("fail, turns are not counting down");
  }
  //check treaty expires
  testTreat.modifyTurns();
  if(testTreat.getActive()){
    System.out.println(testTreat.getTurns());
    System.out.println("fails, teatry should not be active");
  }
  
  //check treaty ends if violated and reasigns money
  
  //check treaty can only be offered on a boundary
  
  //check treaty is removed from players treaties when ended (violated or just ended)
  if(player1.getTreaties().contains(testTreat)){
    System.out.println("fails, treaty should no longer be attached to player");
  }
  if(player2.getTreaties().contains(testTreat)){
    System.out.println("fails, treaty should no longer be attached to player");
  }  
  //check that there can only be on treaty between the same 2 players on the same boundary
 
 
 
  }
}
