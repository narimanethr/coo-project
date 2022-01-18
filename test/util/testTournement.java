package util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.Competition;
import main.Tournement;
import util.Competitor;
import java.util.*;

class testTournement extends CompetitionTest {
	protected Competition t;

	@Override
	protected Competition createCompetition() {
		List<Competitor> competitors = createListOfCompetitor(4);
		return new Tournement(competitors);

	}

	@Test
	void testplay() {
		this.t = createCompetition();
		// 3 match so 3 points

		// List<Competitor> l = new ArrayList<Competitor>() ;
		// Competitor c1 = new Competitor("c1");
		// Competitor c2 = new Competitor("c2");
		// Competitor c3 = new Competitor("c3");
		// Competitor c4 = new Competitor("c4");
		// l.add(c3);
		// l.add(c1);
		// l.add(c4);
		// l.add(c2);
		t.play();
		int comp = 0;
		for (Competitor c : t.getCompetitors()) {
			comp += c.getnbpoints();

		}
		assertEquals(3, comp);
		int cmp = 0;
		for (Competitor c : t.getCompetitors()) {
			if (c.getnbpoints() == 2) {
				cmp += 1;
			}

		}
		assertTrue(cmp == 1);

	}

}
