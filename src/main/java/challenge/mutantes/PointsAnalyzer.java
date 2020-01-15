package challenge.mutantes;

import java.util.ArrayList;

public class PointsAnalyzer {
    public static boolean isSequence(String[] data, Point point, ArrayList<Point> points) {
        char pointValue = data[point.getPositionX()].charAt(point.getPositionY());

        for(Point point1 : points) {
            if (data[point1.getPositionX()].charAt(point1.getPositionY()) != pointValue) {
                return false;
            }
        }

        return true;
    }
}
