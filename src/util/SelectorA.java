package util;
import java.util.* ;
public class SelectorA implements Selector{
  private List<Competitor> next = new ArrayList<Competitor>() ;
  public SelectorA(){
  }
  /** After running the pools this methode take the best of each groupe to pass to the next phase
   * and since the pools are already sorted it takes the first one sipmly
   *
  *@param :List<List<Competitor>>
  *@return :None
  */
  @Override
  public List<Competitor> select(List<List<Competitor>> pools){
    for (List<Competitor> pool:pools ){
        this.next.add(pool.get(0)) ;
    }
    return this.next ; 
  }
}
