package util;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import main.Competition;
import main.League;

public abstract class CompetitionTest {
	protected abstract Competition createCompetition();

	protected List<Competitor> createListOfCompetitor(final int NB_COMPETITORS) {
		List<Competitor> competitors = new ArrayList<Competitor>();
		for (int i = 1; i <= NB_COMPETITORS; i++) {
			competitors.add(new Competitor("" + i));
		}
		return competitors;
	}

	@Test
	void testRanking() {
		Competitor c1 = new Competitor("c1");
		Competitor c2 = new Competitor("c2");
		Competitor c3 = new Competitor("c3");
		Competitor c4 = new Competitor("c4");

		// giving 4 points to c1 , 3 points to c2 , 2 to c3, and 1 to c4

		c1.addpoint();
		c1.addpoint();
		c1.addpoint();
		c1.addpoint();
		c2.addpoint();
		c2.addpoint();
		c2.addpoint();
		c3.addpoint();
		c3.addpoint();
		c4.addpoint();

		List<Competitor> l = new ArrayList<Competitor>();
		// adding the competitors to a list in no order so we compare it to a sorted
		// linkedhashmap to see if the ranking methode works properly
		l.add(c3);
		l.add(c1);
		l.add(c4);
		l.add(c2);
		Competition comp = new League(l);
		comp.ranking();
		// creating a sorted Linkedhashmap
		Map<Competitor, Integer> res = new LinkedHashMap<Competitor, Integer>();
		res.put(c1, c1.getnbpoints());
		res.put(c2, c2.getnbpoints());
		res.put(c3, c3.getnbpoints());
		res.put(c4, c4.getnbpoints());
		assertTrue(comp.ranking().equals(res));

	}

}
