package challenge.mutantes;

import java.util.ArrayList;

public class PointsAnalyzer {
    public static boolean isSequence(String[] data, Point point, ArrayList<Point> points) {
        char pointValue = data[point.getPositionY()].charAt(point.getPositionX());

        for(Point point1 : points) {
            if (data[point1.getPositionY()].charAt(point1.getPositionX()) != pointValue) {
                return false;
            }
        }

        return true;
    }
}
