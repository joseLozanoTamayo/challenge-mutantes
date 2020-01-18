package challenge.mutantes.Utils;

import challenge.mutantes.Utils.Point;
import challenge.mutantes.Utils.RightDiagonalFinder;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RightDiagonalFinderTest {
    @Test
    public void testGeneratedPoints() {
        RightDiagonalFinder finder = new RightDiagonalFinder(new Point(0, 0));
        ArrayList<Point> generatedPoints = finder.getPoints();

        assertEquals(new Point(1, 1), generatedPoints.get(0));
        assertEquals(new Point(2, 2), generatedPoints.get(1));
        assertEquals(new Point(3, 3), generatedPoints.get(2));
    }

    @Test public void testIsSequenceFalse() {
        RightDiagonalFinder finder = new RightDiagonalFinder(new Point(0, 0));
        String[] data = {"ATGCGA","CAGTGC","TAATTT","AGACGG","GCGTCA","TCACTG"};

        assertFalse(finder.isSequence(data));
    }

    @Test public void testIsSequenceTrue() {
        RightDiagonalFinder finder = new RightDiagonalFinder(new Point(2, 2));
        String[] data = {"CTGCGA", "CAGTGC", "ATGTTT", "GATGGC", "ACGTGA", "TCACTG"};

        assertTrue(finder.isSequence(data));
    }
}
