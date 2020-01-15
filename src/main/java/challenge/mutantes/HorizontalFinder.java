package challenge.mutantes;

import java.util.ArrayList;

public class HorizontalFinder {
    private static final int SEQUENCE_LENGTH = 4;
    private Point startPoint;
    private ArrayList<Point> points;

    public HorizontalFinder(Point startPoint) {
        this.startPoint = startPoint;
        points = new ArrayList<>();
        generatePoints(startPoint);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    private void generatePoints(Point startPoint) {
        for (int i = 1; i < SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX() + i, startPoint.getPositionY()));
        }
    }

    public Boolean isSequence(String[] data) {
        return PointsAnalyzer.isSequence(data, startPoint, points);
    }
}
