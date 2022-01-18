package util;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.Competition;
import main.League;

class testLeague extends CompetitionTest {
	protected Competition league;

	@Override
	protected Competition createCompetition() {
		List<Competitor> competitors = createListOfCompetitor(4);
		return new League(competitors);
	}
	@Test
	void testplay() {
		this.league = createCompetition();
		// 12 match so 12 points in total
		league.play();
		int comp = 0;
		List<Competitor> l = league.getCompetitors();
		for (Competitor c : league.getCompetitors()) {
			comp += c.getnbpoints();

		}
		assertEquals(12, comp);
		// each competitor play 6 games so max is 6 points
		assertTrue(l.get(0).getnbpoints() < 6);
		assertTrue(l.get(1).getnbpoints() < 6);
		assertTrue(l.get(2).getnbpoints() < 6);
		assertTrue(l.get(3).getnbpoints() < 6);

	}

}
