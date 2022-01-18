package util;
public class NormalMatch extends AbsMatch implements Match{
  public NormalMatch(){

  }
  /** function that makes the two teams face each other and chose one of the teams randomly to make him win an return him and eventually add one 1 point to his attribute points

  @param :Competitor 
  @return :Competitor
  */

  public Competitor play(Competitor c1 , Competitor c2){
    int min = 1 ;
    int max = 2 ;
    double rand = Math.floor(Math.random()*(max-min+1)+min) ; //génération d un nombre aléatoire entre 1 ou 2 pour décider qui gagne
    if(rand==1){
      c1.addpoint() ;
      for (Observeur o:this.obs){
        o.observer(c1, c2);
      }
      return c1 ;
    }

    c2.addpoint() ;
    for (Observeur o : this.obs){
      o.observer(c2,c1) ; 
    }
    return c2 ;
  }
}
