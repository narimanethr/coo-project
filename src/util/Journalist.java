package util;
public class Journalist implements Observeur{
  public Journalist(){

  }
  /** A function that thakes 2 Competitors that the first one is the winner and the second one is the looser
   *and print the new for us in the console 
   * @param :Competitor
   * @return :None 
  */

  public void observer(Competitor c1 , Competitor c2){
    
    System.out.println(c1.getname() + " VS " + c2.getname() + " : "+ c1.getname() + " Has Won ! " ) ; 
  }
}
