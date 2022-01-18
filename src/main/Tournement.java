package main;
import java.util.* ;

import util.* ; 
public class Tournement extends Competition {
  private List<Competitor> current = new ArrayList<Competitor>();
  private List<Competitor> qualified = new ArrayList<Competitor>() ;
  public Tournement(List<Competitor> l ){
    super(l) ;
  }
  public Competitor playMatch(Competitor c1 , Competitor c2 ){
    Match m = this.getmatch() ; 
    return m.play(c1,c2) ; 
  }
  /** a function that makes the tournement run by taking 2 other list putting the current list into the playing 
  adding the winners in another list and clearing the current and putting those winners into the current list so 
  we can make them play again since it's only them who are going to play and clearing the winners list and it ends when 
  we only have 1 team in the end so he is the winner 
  @param :List
  @return : none 
   */
  @Override
  public void play(List<Competitor> comps) {
    Match m = this.getmatch() ; 
    for(int k = 0 ; k <comps.size();k = k+2 ){
        this.current.add(this.playMatch(comps.get(k),comps.get(k+1))) ; 

    }
    while(this.current.size() > 2 ) {
      for(int i=0 ; i< this.current.size() ; i = i+2){
        Competitor win = this.playMatch(this.current.get(i) , this.current.get(i+1)) ;
        this.qualified.add(win) ;
      }
      // deleting the old currents because we only have the half of them now and the other lost
      this.current.clear() ;
      // copying what's in qualified in the current list 
      for(Competitor c: this.qualified){
        this.current.add(c) ; 
      }
      this.qualified.clear() ;
    }
    // the call here in the end ( final ) shouldn't be in the loop because it will clear the list current at the end so we need to call it another time in the outside of the loop so we don't clear it 
    Competitor winner = this.playMatch(this.current.get(0) , this.current.get(1)) ; 
    //we print here the winner 
    System.out.println("The winner of the Tournement is : " + winner.getname()) ; 
  }
}
