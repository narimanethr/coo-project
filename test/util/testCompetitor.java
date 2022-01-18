package util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import util.Competitor;
class testCompetitor {
	protected  Competitor c1;
	private  int initialpoints;
	
	  @Test
	   public void TestGetName() {
		   this.c1 = new Competitor("c1");
	      assertEquals("c1", c1.getname());
	   }
	 
	   @Test
	   public void TestAddNbrPoints() {
		   this.c1 = new Competitor("c1");
		   int initialpoints = c1.getnbpoints();
		   c1.addpoint();
		assertEquals(c1.getnbpoints(), initialpoints + 1);
		   
		   
	   }
	
	   @Test
	   public void TestGetNbrPoints() {
		   this.c1 = new Competitor("c1");
		   c1.addpoint();  
	      assertEquals(1, c1.getnbpoints());
	   }


	

	

}
