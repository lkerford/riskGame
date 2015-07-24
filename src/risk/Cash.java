package risk;

public class Cash extends GameObject {
  private int amount;
  public Cash(){
    amount = 0;
  }
  
  public int getAmount(){
    return amount;
  }
  public void changeAmount(int value){
    amount += value;
  }
}
