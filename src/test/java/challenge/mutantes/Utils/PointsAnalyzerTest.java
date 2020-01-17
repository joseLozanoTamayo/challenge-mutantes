package challenge.mutantes.Utils;

import challenge.mutantes.Utils.Point;
import challenge.mutantes.Utils.PointsAnalyzer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PointsAnalyzerTest {
    @Test public void testSequenceFalse() {
        String[] data = {"ATGCGA"};
        Point point = new Point(0, 0);
        ArrayList<Point> points = new ArrayList();
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));

        assertFalse(PointsAnalyzer.isSequence(data, point, points));
    }

    @Test public void testSequenceTrue() {
        String[] data = {"TCCCC"};
        Point point = new Point(1, 0);
        ArrayList<Point> points = new ArrayList();
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));

        assertTrue(PointsAnalyzer.isSequence(data, point, points));
    }
}
