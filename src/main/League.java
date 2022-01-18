package main;
import java.util.* ;
import util.* ; 
public class League extends Competition {
  private List<Competitor> enemies = new ArrayList<Competitor>() ; 
  public League(List<Competitor> l) {
    super(l);

  }
  public Competitor playMatch(Competitor c1 , Competitor c2 ){
    Match m = this.getmatch() ; 
    return m.play(c1,c2) ; 
  }
  /** a function that makes the league play with taking a competitor one by one and another list except that competitor so he doesn't play against himself
  and since it's a league and there are 2 games facing the same team so we just remove the actual team
  @param :List
  @return : none 
  */
  @Override
  public void play(List<Competitor> comps){
    for(Competitor c1:comps){
      //here we are coppying the enemies in other list since we can't do .remove() here because of the iterator problems 
      for(Competitor enemy:comps){
          if(enemy != c1) {
            this.enemies.add(enemy) ; 
          }
      }
      for(Competitor c2:this.enemies){
        this.playMatch(c1,c2) ;
        }
      this.enemies.clear() ; 
      }
    }
  
  }
