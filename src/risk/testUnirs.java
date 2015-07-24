package risk;

public class testUnirs {
  //TEST territories
  public static void main(String [ ] args){
      Territory test = new Territory("Alberta");
      Territory testNeighbour = new Territory("BC");
      Territory testNeighbour2 = new Territory("NFL");
      
      if(test.getNeighbour().size() ==0){
        System.out.println("correct number of neighbours");
      }
      test.addNeighbour(testNeighbour);
      if(test.getNeighbour().size() ==1){
        System.out.println("correct number of neighbours");
      }
      test.addNeighbour(testNeighbour2);
      if(test.getNeighbour().size() ==2){
        System.out.println("correct number of neighbours");
      }
      if(!test.getState()){
        System.out.println("correct state");
      }
      
      
  }
}
