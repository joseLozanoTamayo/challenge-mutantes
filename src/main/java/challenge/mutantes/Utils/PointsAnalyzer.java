package challenge.mutantes.Utils;

import java.util.ArrayList;

public class PointsAnalyzer {
    public static boolean isSequence(String[] data, Point point, ArrayList<Point> points) {
        char startPointValue = data[point.getPositionY()].charAt(point.getPositionX());

        for(Point actualPoint : points) {
            if (actualPoint.getPositionX() < 0 || actualPoint.getPositionY() < 0) {
                return false;
            }

            if (actualPoint.getPositionX() >= data[0].length() || actualPoint.getPositionY() >= data.length) {
                return false;
            }

            if (data[actualPoint.getPositionY()].charAt(actualPoint.getPositionX()) != startPointValue) {
                return false;
            }
        }

        return true;
    }
}
