package challenge.mutantes.Utils;

import challenge.mutantes.Utils.Point;
import challenge.mutantes.Utils.VerticalFinder;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VerticalFinderTest {
    @Test
    public void testGeneratedPoints() {
        VerticalFinder finder = new VerticalFinder(new Point(0, 0));
        ArrayList<Point> generatedPoints = finder.getPoints();

        assertEquals(new Point(0, 1), generatedPoints.get(0));
        assertEquals(new Point(0, 2), generatedPoints.get(1));
        assertEquals(new Point(0, 3), generatedPoints.get(2));
    }

    @Test public void testIsSequenceFalse() {
        VerticalFinder finder = new VerticalFinder(new Point(0, 0));
        String[] data = {"A","C","T","A","G","T"};
        
        assertFalse(finder.isSequence(data));
    }

    @Test public void testIsSequenceTrue() {
        VerticalFinder finder = new VerticalFinder(new Point(0, 2));
        String[] data = {"G","T","A","A","A","A"};

        assertTrue(finder.isSequence(data));
    }
}
