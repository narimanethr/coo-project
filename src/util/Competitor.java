package util ;
public class Competitor{
  private int points ; //staking the points number
  private String name ;

  public Competitor(String n) {
    this.points = 0;
    this.name = n ;

  }
  /** a function that add 1 point to the team in case of winning we call it
  @param : none
  @return : none
  */
  public void addpoint(){
    this.points += 1 ;
  }
  /** a funciton that returns us the number of point for that team
  @param : none
  @return :int
   */
  public int getnbpoints() {
    return this.points ;
  }
  /** a function that returns the name of that team
  @param : none
  @return : string
  */

  public String getname() {
    return this.name ;
  }
}
