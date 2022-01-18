package main;
import java.util.* ;

import util.* ; 

import static java.util.Comparator.comparing;
public abstract class Competition{
    private Match match ;
    private final List<Competitor> competitors ;
    public Competition(List<Competitor> comps) {
      this.match = new NormalMatch() ;
      this.competitors = comps ;
    }
    /**a function that makes the competition start playing by callig the abstract methode play 
    @param :none 
    @return : none  */
    public  void play() {
        this.play(this.competitors);
    }
    public Match getmatch(){
      return this.match ; 
    }
    public List getcomps(){
      return this.competitors ; 
    }
    /** abstract methode of playing 
    @param:List 
    @return :None  */
    public abstract void play(List<Competitor> comp) ; 
    /** abstract methode that makes 2 competitors play the game 
    @param : Competitor, Competitor 
    @return: Competitor  */
    public abstract Competitor playMatch(Competitor c1 , Competitor c2) ;

    /**a funciton that uses the list of competitors and sort them basing on the points they have 
    we use linked list so we garantee that they be added in the hashmap the same order of the loop (the sorted list)
    @param :none
    @return :Map 
     */
    public Map<Competitor,Integer > ranking(){
      Collections.sort(this.competitors, comparing(Competitor::getnbpoints));
      Collections.reverse(this.competitors) ; 
      Map< Competitor , Integer> res = new LinkedHashMap<Competitor,Integer>() ; 
      for(Competitor c:this.competitors){
        res.put(c,c.getnbpoints()) ; 
      } 
      return res ;

    }
    public void addobservers(List<Observeur> l){
      for (Observeur obs:l){
        this.getmatch().addobs(obs) ;
      }
    }
    public final List<Competitor> getCompetitors() {
		return this.competitors;
	}

	public static void main(String args[]) {
      Competition competition ;
      List<Competitor> comps = new ArrayList<Competitor>() ;
      System.out.println("Hello , Type L for league and T for Tournement type and M for Masters") ;
      Scanner scanner = new Scanner(System.in) ;
      String type = scanner.nextLine() ;
      System.out.println("Do you want a Journalist ? (y/n) ") ; 
      String journaliste = scanner.nextLine() ; 
      System.out.println("Do you want a BookMaker ? (y/n) ") ; 
      List<Observeur> observers = new ArrayList<Observeur>(); 
      String bookmaker = scanner.nextLine() ; 
      if(journaliste.equals("y")){
        Observeur j = new Journalist() ; 
        observers.add(j) ; 
      }
      if(bookmaker.equals("y")){
        Observeur b = new BookMaker() ; 
        observers.add(b) ;
     }
      if(type.equals("M") || type.equals("m") ) {
        System.out.println("Here we are going to try the 16 teams version and since it's very long we are not going to give you the access to anything since it's very long , thank you ! and enjoy .  \n") ;
        Competitor c1 = new Competitor("A") ;
        comps.add(c1) ;
        Competitor c2 = new Competitor("B") ;
        comps.add(c2) ;
        Competitor c3 = new Competitor("C") ;
        comps.add(c3) ;
        Competitor c4 = new Competitor("D") ;
        comps.add(c4) ;
        Competitor c5 = new Competitor("E") ;
        comps.add(c5) ;
        Competitor c6 = new Competitor("F") ;
        comps.add(c6) ;
        Competitor c7 = new Competitor("G") ;
        comps.add(c7) ;
        Competitor c8 = new Competitor("H") ;
        comps.add(c8) ;
        Competitor c9 = new Competitor("I") ;
        comps.add(c9) ;
        Competitor c10 = new Competitor("J") ;
        comps.add(c10) ;
        Competitor c11 = new Competitor("K") ;
        comps.add(c11) ;
        Competitor c12 = new Competitor("L") ;
        comps.add(c12) ;
        Competitor c13 = new Competitor("M") ;
        comps.add(c13) ;
        Competitor c14 = new Competitor("N") ;
        comps.add(c14) ;
        Competitor c15 = new Competitor("O") ;
        comps.add(c15) ;
        Competitor c16 = new Competitor("P") ;
        comps.add(c16) ;
        Selector s = new SelectorA() ; 
        competition = new Masters(comps, 4 , 4 , s ) ;
        competition.addobservers(observers);
        competition.play();

      }
      if(type.equals("T") || type.equals("t")){
        System.out.println(" welcome to the beta version of Sport Competition  \n") ;
        System.out.println("we are only going to use 4 teams this time  \n") ;
        System.out.println("First Competitor Name : ") ;
        String n1 = scanner.nextLine() ;
        Competitor c1 = new Competitor(n1) ;
        comps.add(c1) ;
        System.out.println("Second Competitor Name :") ;
        String n2 = scanner.nextLine() ;
        Competitor c2 = new Competitor(n2) ;
        comps.add(c2) ;
        System.out.println("Third Competitor Name :") ;
        String n3 = scanner.nextLine() ;
        Competitor c3 = new Competitor(n3) ;
        comps.add(c3) ;
        System.out.println("Fourth Competitor Name :") ;
        String n4 = scanner.nextLine() ;
        scanner.close() ;
        Competitor c4 = new Competitor(n4) ;
        comps.add(c4) ;
          competition = new Tournement(comps) ;
          competition.addobservers(observers);
          competition.play() ;
          for (Map.Entry<Competitor, Integer> pair : competition.ranking().entrySet()) {
              System.out.println(String.format("Name: %s, Points: %s", pair.getKey().getname(), pair.getValue()));   
          }
      }
      else if( type.equals("L") || type.equals("l") ){
        System.out.println(" welcome to the beta version of Sport Competition  \n") ;
      System.out.println("we are only going to use 4 teams this time  \n") ;
      System.out.println("First Competitor Name : ") ;
      String n1 = scanner.nextLine() ;
      Competitor c1 = new Competitor(n1) ;
      comps.add(c1) ;
      System.out.println("Second Competitor Name :") ;
      String n2 = scanner.nextLine() ;
      Competitor c2 = new Competitor(n2) ;
      comps.add(c2) ;
      System.out.println("Third Competitor Name :") ;
      String n3 = scanner.nextLine() ;
      Competitor c3 = new Competitor(n3) ;
      comps.add(c3) ;
      System.out.println("Fourth Competitor Name :") ;
      String n4 = scanner.nextLine() ;
      Competitor c4 = new Competitor(n4) ;
      comps.add(c4) ;
      scanner.close() ;
      competition = new League(comps) ;
      competition.addobservers(observers);
        competition.play() ;
        for (Map.Entry<Competitor, Integer> pair : competition.ranking().entrySet()) {
              System.out.println(String.format("Name : %s, Points : %s", pair.getKey().getname(), pair.getValue()));   
          }
      }

    }
}
