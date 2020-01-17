package challenge.mutantes.Utils;

import challenge.mutantes.Utils.HorizontalFinder;
import challenge.mutantes.Utils.Point;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HorizontalFinderTest {
    @Test public void testGeneratedPoints() {
        HorizontalFinder finder = new HorizontalFinder(new Point(0, 0));
        ArrayList<Point> generatedPoints = finder.getPoints();

        assertEquals(new Point(1, 0), generatedPoints.get(0));
        assertEquals(new Point(2, 0), generatedPoints.get(1));
        assertEquals(new Point(3, 0), generatedPoints.get(2));
    }

    @Test public void testIsSequenceFalse() {
        HorizontalFinder finder = new HorizontalFinder(new Point(0, 0));
        String[] data = {"TCCCC"};

        assertFalse(finder.isSequence(data));
    }

    @Test public void testIsSequenceTrue() {
        HorizontalFinder finder = new HorizontalFinder(new Point(1, 0));
        String[] data = {"TCCCC"};

        assertTrue(finder.isSequence(data));
    }
}
