package util;

import util.SelectorB;
import static org.junit.jupiter.api.Assertions.*;

import util.Competitor;
import main.Competition;
import main.League;
import main.Masters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.Masters;
import util.SelectorA;
import org.junit.jupiter.api.Test;
import main.Masters;
import main.PoolRunner;
import util.SelectorB;

public abstract class TestMasters {
	protected static List<Competitor> cmp = new ArrayList<Competitor>();
	protected static Competition l;

	protected abstract Competition createCompetition();

	protected List<Competitor> createListOfCompetitor(final int NB_COMPETITORS) {
		List<Competitor> competitors = new ArrayList<Competitor>();
		for (int i = 1; i <= NB_COMPETITORS; i++) {
			competitors.add(new Competitor("" + i));
		}
		return competitors;
	}



}
