package util;
import java.util.* ;

public abstract class AbsMatch{
    protected List<Observeur> obs = new ArrayList<Observeur>() ;  // list of observers 

    public abstract Competitor play(Competitor c1 , Competitor c2 );
    /** a methode to add an observer to the list of observers .
     * @param Observeur
     * @return None 
     */
	public void addobs(Observeur o ){
        this.obs.add(o) ; 
    } ;
}