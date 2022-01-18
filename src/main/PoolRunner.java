package main;
import java.util.* ;
import util.* ; 
import static java.util.Comparator.comparing;

public class PoolRunner extends Competition {
    private List<List<Competitor> > pools = new ArrayList<List<Competitor> >() ; 
    private int nbpools  ; 
    private int TeamsInPool ; 
    private List<Competition> leagues  = new ArrayList<Competition>(); 
    public PoolRunner(List<Competitor> l , int p , int t ){
        super(l) ; 
        this.nbpools = p ; 
        this.TeamsInPool = t  ; 
    }
    /** Creating the list of pools and putting it in the attribute pools 
     * @param :None 
     * @return : None 
     */
    public void CreatePools(List<Competitor> comps ){
        int i ; 
        for (i=0 ; i< this.nbpools ; i++ ){
            int  k ; 
            List<Competitor> helper = new ArrayList<Competitor>() ; 
            for (k=0 ; k<this.TeamsInPool ; k++) {
                helper.add(comps.get(i*this.TeamsInPool+k)) ;
            }
            this.pools.add(helper) ; 
        }
    }
    /** A getter for the pools 
     * @param :None 
     * @return : List<List<Competitor>> 
     */
    public List<List<Competitor> > getPools() {
        return this.pools ; 
    }
    /** a methode to add the observer to every league of pools since every one of them has a its own match instance 
     * @param List<Observeur> 
     * @return None 
     */
    @Override
    public void addobservers(List<Observeur> l ){
        for (Competition league:this.leagues){
            league.addobservers(l) ; 
        }

    }
    /**a function that creates leagues and add to the list
     * @param :None 
     * @return :None 
     */
    @Override
    public void play(List<Competitor> comps){
        for(List<Competitor> pool:this.pools){
            Competition league = new League(pool) ; 
            this.leagues.add(league) ; 
        }
            
    }
    /** runpool methode that makes every league plays 
     * @param None 
     * @return None 
     */
    public void runpool(){
        for(Competition league:this.leagues){
            league.play() ;
            Collections.sort(league.getCompetitors(), comparing(Competitor::getnbpoints));
            Collections.reverse(league.getCompetitors()) ;
        }
    }
    // we do not actually need it because we are going to use the league to make the pools play
    @Override 
    public Competitor playMatch(Competitor c1 , Competitor c2){
        return c1 ; //cuz it's not needed ( all the playmatch calls are either in league or in tournement )
    }
}