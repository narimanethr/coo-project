package main;
import java.util.* ;
import util.* ;
public class Masters extends Competition {
    private int t ;
    private int p  ;
    private Selector selector ;
    private List<Observeur> observers = new ArrayList<Observeur>() ; 
    private Boolean observed = false ; 
    public Masters(List<Competitor> l , int nbteams , int nbpools , Selector s){
        super(l) ;
        this.t = nbteams ;
        this.p = nbpools ;
        this.selector = s ;
    }
    /** puts the list of observers in ovservers attribute changes the value of observer to true so when we call the play methode 
     * it adds the observers to the pool (every league ) and the finals phase to by the part of if oberved -> .addobserver()
     * @param List<Observeur> 
     * @return None 
     */
    @Override
    public void addobservers(List<Observeur> l ){
        this.observed = true ; 
        this.observers = l ; 
    }
    /** play function that makes everything run 
     * @param :List<Competitor>
     * @return : None
     */
    @Override
    public void play(List<Competitor> comps) {
        PoolRunner poolrunner = new PoolRunner(comps , this.p , this.t) ;
        poolrunner.CreatePools(comps) ;
        poolrunner.play() ;
        if(this.observed){
            poolrunner.addobservers(this.observers);
        }
        poolrunner.runpool() ;
        int cpt = 0 ; // for printing a number for each specific groupe
        List<List<Competitor>> pools = poolrunner.getPools() ;
        for(List<Competitor> l : pools ){
            Competition league = new League( l )  ;
            System.out.println("--------Gourpe :" + (cpt++) + "--------") ;
            for (Map.Entry<Competitor, Integer> pair : league.ranking().entrySet()) {
                System.out.println(String.format("Name: %s, Points: %s", pair.getKey().getname(), pair.getValue()));
            }

        }
        Competition finals = new Tournement(this.selector.select(pools)) ;
        if(this.observed){
            finals.addobservers(this.observers);
        }
        finals.play() ;
        for (Map.Entry<Competitor, Integer> pair : finals.ranking().entrySet()) {
            System.out.println(String.format("Name : %s, Points : %s", pair.getKey().getname(), pair.getValue()));
        }
     }
     // we do not actually need it because we are going to use the Tournement to make the finals play
    @Override
    public Competitor playMatch(Competitor c1 , Competitor c2){
        return c1 ; //cuz it's not needed ( all the playmatch calls are either in league or in tournement )
    }
}
