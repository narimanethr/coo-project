package util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import main.Competition;
import main.Masters;
public class TestMastersSrategy2 extends TestMasters {
    SelectorB s;
    protected Competition m2;
    @Override
    protected Competition createCompetition() {
    	 this.s= new SelectorB();
        List<Competitor> competitors = createListOfCompetitor(24);
        return new Masters(competitors, 8, 3, s);
    }



    @Test
    void TestMastersWithSelectorB() {
    	this.m2 = createCompetition();
        m2.play();
        int cpt = 0;
        for (Competitor c : m2.getCompetitors()) {
            cpt += c.getnbpoints();
            assertTrue(c.getnbpoints() <= 14); // car un competitor ne joue pas plus de 8 match donc impossible d'avoir
                                               // plus de 8 points (6 dans les poules et 2 dans les finales )

        }
        assertEquals(175, cpt); // 51 points car 51 match au total

    }
}