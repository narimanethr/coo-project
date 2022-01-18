package util;
import java.util.* ; 
public class BookMaker implements Observeur{
    Map<Competitor,Integer> list = new HashMap<Competitor, Integer>()  ; // the place where the bookmaker mark his cotes 
  public BookMaker(){
  }
  /** A function that takes 2 Competitors that the first one is the winner and the second one is the looser
   *and change the values of each of them in the hashmap and print the new values
   * @param :Competitor
   * @return :None 
  */

  public void observer(Competitor c1 , Competitor c2){
    if (this.list.containsKey(c1) ){
        int v1 = this.list.get(c1) ; 
        if (v1 > 1){ //doesn't mean anything if they have 0 win so there is no less than 1 even tho 1 has no meaning also because you will gain the same amount of money you payed 
            this.list.put(c1, v1-1);
        }
    }
    if (this.list.containsKey(c2)) {
        this.list.put(c2,this.list.get(c2)+1) ;  // always add up since there is no limit for how further it goes 
    } 
    if(!this.list.containsKey(c1)){
        this.list.put(c1,1) ; //because 2 is the base and sice he is the winner 2-1 = 1 
    }
    if(!this.list.containsKey(c2)){
        this.list.put(c2,3) ; // 2+1 because looser 
    }

  System.out.println(c1.getname() + " Now is : " + this.list.get(c1) + " And " + c2.getname() + " Now is : " + this.list.get(c2) ) ; 
    }
    
}
