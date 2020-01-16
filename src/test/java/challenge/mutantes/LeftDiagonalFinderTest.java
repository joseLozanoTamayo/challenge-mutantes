package challenge.mutantes;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LeftDiagonalFinderTest {
    @Test
    public void testGeneratedPoints() {
        LeftDiagonalFinder finder = new LeftDiagonalFinder(new Point(5, 0));
        ArrayList<Point> generatedPoints = finder.getPoints();

        assertEquals(new Point(4, 1), generatedPoints.get(0));
        assertEquals(new Point(3, 2), generatedPoints.get(1));
        assertEquals(new Point(2, 3), generatedPoints.get(2));
    }

    @Test public void testIsSequenceFalse() {
        LeftDiagonalFinder finder = new LeftDiagonalFinder(new Point(0, 0));
        String[] data = {"ATGCGA","CAGTGC","TAATTT","AGACGG","GCGTCA","TCACTG"};

        assertFalse(finder.isSequence(data));
    }

    @Test public void testIsSequenceTrue() {
        LeftDiagonalFinder finder = new LeftDiagonalFinder(new Point(5, 0));
        String[] data = {"ATGCGA","CAGTAC","TAAATT","AGACGG","GCGTCA","TCACTG"};

        assertTrue(finder.isSequence(data));
    }
}
