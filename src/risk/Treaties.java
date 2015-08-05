package risk;

public class Treaties {
  private Player offerer;
  private Player receiver;
  private Territory[] boundary;
  private Cash fee;
  private int turns;
  private boolean accepted;
  private boolean active;
  private boolean violated;
  
  public Treaties(Player offerer, Player receiver, Territory first, Territory second, Cash amount, int numTurns){
    this.offerer= offerer;
    this.receiver = receiver;
    boundary = new Territory[]{first,second};
    fee= amount;
    turns = numTurns;
    accepted = false;
    active = true;
    violated = false;
  }
  
  public void respond(boolean responce){
    if(active){
      accepted = responce;
    }
    else if (!responce){}
     deactivate();
  }
  
   public void deactivate(){
     if(!accepted){
         active = false;
     }
   }
   public Territory[] getTerritories(){
     return boundary;
   }
   
   public boolean returnState(){
     return active;
   }
   
   public boolean getAccepted(){
     return accepted;
   }
   
   public boolean getViolated(){
     return violated;
   }
   
   public Player[] getPlayers( ){
     return new Player[]{receiver,offerer};
   }
   
   public int getTurns(){
     return turns;
   }
   
   public void modifyTurns(int mod){
     turns += mod;
   }
   
   public void modifyTurns(){
     --turns;
   }
   
   public void isViolated(Player violator){
     if(violator == offerer){
       (receiver.getCash()).changeAmount(fee.getAmount());
       (offerer.getCash()).changeAmount(fee.getAmount()*-1);
     }
     else if(violator == receiver){
       (receiver.getCash()).changeAmount(fee.getAmount()-1);
       (offerer.getCash()).changeAmount(fee.getAmount());
     }
   }
}
