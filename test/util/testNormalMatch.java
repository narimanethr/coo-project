package util;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
class testNormalMatch {
	@Test
	void testplay() {
		Competitor c1 = new Competitor("c1");
		Competitor c2 = new Competitor("c2");
		NormalMatch m = new NormalMatch();
        m.play(c1,c2);
        assertTrue(c1.getnbpoints()==1||c2.getnbpoints()==1);

		
	}
	 
	

	

}
