package util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import util.SelectorA;
import org.junit.jupiter.api.Test;

class TestSelectorA {

	@Test
	void TestSelect() {
		Competitor c1 = new Competitor("c1");
		Competitor c2 = new Competitor("c2");
		Competitor c3 = new Competitor("c3");
		Competitor c4 = new Competitor("c4");
		Competitor c5 = new Competitor("c5");
		Competitor c6 = new Competitor("c6");
		
		SelectorA s = new SelectorA();
		
		  List<List<Competitor>> pools = new ArrayList<>();
		// Creating innerList 
	      List<Competitor> l1 = new ArrayList<>();
	      // Adding elements to innerList
	        l1.add(c1);
	        l1.add(c2);
	        l1.add(c3);
	     // Adding innerList to pools
	        pools.add(l1);
	        List<Competitor> l2 = new ArrayList<>();
		      // Adding elements to innerList
		        l2.add(c4);
		        l2.add(c5);
		        l2.add(c6);
		     // Adding innerList to pools
		        pools.add(l2);
		     List<Competitor> next =s.select(pools);
		     assertTrue(next.size()==2);
		    
		        
		      
	        
	       
	}
}
