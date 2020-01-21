package challenge.mutantes.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatsTest {
    Stats stats;

    @Test public void testRatioOnlyHuman() {
        stats = new Stats(0, 100);
        assertEquals(0, stats.getRatio(), 0.0);
    }

    @Test public void testRatioOnlyMutant() {
        stats = new Stats(40, 0);
        assertEquals(0, stats.getRatio(), 0.0);
    }

    @Test public void testRatioEquals() {
        stats = new Stats(10, 10);
        assertEquals(1, stats.getRatio(), 0.0);
    }

    @Test public void testRatioMoreHumans() {
        stats = new Stats(40, 100);
        assertEquals(0.4, stats.getRatio(), 0.0);
    }

    @Test public void testRatioMoreMutants() {
        stats = new Stats(100, 40);
        assertEquals(2.5, stats.getRatio(), 0.0);
    }
}