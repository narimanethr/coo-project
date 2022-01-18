package util;
import util.BookMaker;
import util.Competitor;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.*;
import org.junit.jupiter.api.Test;
import main.Competition;
class TestBookMakers  {
	protected Competition c ;
	protected  Map<Competitor,Integer> list = new HashMap<Competitor, Integer>();
	Competitor c1 ;
	Competitor c2 ;
	BookMaker b;

	@Test
	void testObserver() {
		List<Competitor> r = new ArrayList<>();
		this.c1 = new Competitor("c1");
		this.c2 = new Competitor("c2");
		r.add(c1);
		r.add(c2);
		this.b = new BookMaker();
		this.c = new League(r);
		list.put(c1, 2);
		list.put(c2, 3);
		c.play();
		b.observer(c1, c2);
		Collection<Integer> cot = list.values();
		assertNotNull(cot);
		assertEquals(cot.size(), c.getCompetitors().size());
		for (Competitor competitor : list.keySet()) {
			assertNotNull(competitor);
			Integer cote = list.get(competitor);
			assertNotNull(cote);
			assertTrue(cote.intValue() >= 0);
		}
		 assertTrue(c1.getnbpoints()==1||c2.getnbpoints()==3);

	}

}
