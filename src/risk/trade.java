package risk;

public class trade {
  private Player offerer;
  private Player receipient;
  private Cash sent;
  private Cash received;
  private Territory sentT;
  private Territory receivedT;
  private Boolean accepted;
  private Boolean active;
  
  public trade(Player offerer, Player receipent, Cash offer, Cash wanted){
    this.offerer = offerer;
    this.receipient = receipent;
    sent = offer;
    received = wanted;
    accepted = false;
    active = true;
  }
 
  public trade(Player offerer, Player receipent, Territory offer, Cash wanted){
    this.offerer = offerer;
    this.receipient = receipent;
    sentT = offer;
    received = wanted;
    accepted = false;
    active = true;
  }
  public trade(Player offerer, Player receipent, Cash offer, Territory wanted){
    this.offerer = offerer;
    this.receipient = receipent;
    sent = offer;
    receivedT = wanted;
    accepted = false;
    active = true;
  }
  public trade(Player offerer, Player receipent, Territory offer, Territory wanted){
    this.offerer = offerer;
    this.receipient = receipent;
    sentT = offer;
    receivedT = wanted;
    accepted = false;
    active = true;
  }

  public Player getOffer(){
    return offerer;
  }
  public Player getReceipient(){
    return receipient;
  }
  
  public Boolean getState(){
    return active;
  }
  public String getSent(){
    if(sent != null){
    return String.valueOf(sent.getAmount());}
    return sentT.getName();
  }
  public String getRecieve(){
    if(received != null){
    return String.valueOf(received.getAmount());}
    return receivedT.getName();
  }
  public void cancelTrade(){
    active = false;
  }
  public void awnserTrade(Boolean accept){
    if(active){
      accepted= accept;
      if(accepted){
        acceptOffer();
        }
    active = false;
    }
  }
  
  private void acceptOffer(){
  if(sent != null){
    receipient.getCash().changeAmount(sent.getAmount());
    offerer.getCash().changeAmount((sent.getAmount() * -1));
  }
  else{
    receipient.acquireTerritory(sentT);
    offerer.removeTerritory(sentT);
  }
  if(received != null){
    receipient.getCash().changeAmount(received.getAmount()*-1);
    offerer.getCash().changeAmount((sent.getAmount()));
  }
  else{
    receipient.removeTerritory(receivedT);
    offerer.acquireTerritory(receivedT);
  }
  } 
  
}
