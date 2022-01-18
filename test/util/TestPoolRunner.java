package util;

import main.PoolRunner;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import util.Competitor;
import main.PoolRunner;

class TestPoolRunner {

	@Test
	void testCreatePools() {
		List<Competitor> r = new ArrayList<>();
		int nbpools = 2;
		int TeamsInPool = 3;
		PoolRunner pl = new PoolRunner(r, nbpools, TeamsInPool);
		List<List<Competitor>> pools = new ArrayList<>();
		r.add(new Competitor("p1"));
		r.add(new Competitor("p2"));
		r.add(new Competitor("p3"));
		r.add(new Competitor("p4"));
		r.add(new Competitor("p5"));
		r.add(new Competitor("p6"));
		pl.CreatePools(r);
		pools = pl.getPools();
		assertTrue(pools.size() == nbpools);
		for (List<Competitor> pool : pools) {

			assertTrue(pool.size() == TeamsInPool);

		}

	}
	// la méthode play de poolRunner n'est pas nécéssaire à tester ici car c le méme
	// principe avec la méthode test de masters

}
