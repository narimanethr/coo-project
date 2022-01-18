package util;
import java.util.* ;
public class SelectorB implements Selector{
  private List<Competitor> next = new ArrayList<Competitor>() ;
  public SelectorB(){
  }
  /** function that select the players that pass to the next round (finals) 2 first of each group than 2 of the 2 first groups
   *
  @param :None
  @return :List<Competitor>
  */
  public List<Competitor> select(List<List<Competitor>> pools){
    for (List<Competitor> pool : pools){
        this.next.add(pool.get(0)) ;
        this.next.add(pool.get(1)) ;
    }
    this.next.add(pools.get(0).get(2)) ;
    this.next.add(pools.get(1).get(2)) ;
    return this.next ;
  }
}
