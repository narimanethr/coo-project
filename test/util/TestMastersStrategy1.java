package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Competition;
import main.Masters;

public class TestMastersStrategy1 extends TestMasters {
    SelectorA s;
    protected Competition m1;

    @Override
    protected Competition createCompetition() {
    	this.s = new SelectorA();
        List<Competitor> competitors = createListOfCompetitor(16);
        return new Masters(competitors, 4, 4, s);
    }


    @Test
    void TestMastersWithSelectorA() {
    	this.m1 = this.createCompetition();
        m1.play();
        int cpt = 0;
        for (Competitor c : m1.getCompetitors()) {
            cpt += c.getnbpoints();

        }
        assertEquals(51, cpt); // 51 points car 51 match au total

    }

}
