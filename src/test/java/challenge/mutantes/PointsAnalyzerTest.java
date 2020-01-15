package challenge.mutantes;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PointsAnalyzerTest {
    @Test public void testSequenceFalse() {
        String[] data = {"ATGCGA"};
        Point point = new Point(0, 0);
        ArrayList<Point> points = new ArrayList();
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));

        assertFalse(PointsAnalyzer.isSequence(data, point, points));
    }

    @Test public void testSequenceTrue() {
        String[] data = {"TCCCC"};
        Point point = new Point(0, 1);
        ArrayList<Point> points = new ArrayList();
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));

        assertTrue(PointsAnalyzer.isSequence(data, point, points));
    }
}
