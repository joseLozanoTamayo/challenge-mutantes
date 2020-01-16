package challenge.mutantes;

import java.util.ArrayList;

public class HorizontalFinder {
    private Point startPoint;
    private ArrayList<Point> points;

    public HorizontalFinder(Point startPoint) {
        points = new ArrayList<>();
        setStartPoint(startPoint);
    }

    public HorizontalFinder() {
        this(new Point());
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        generatePoints(startPoint);
    }

    private void generatePoints(Point startPoint) {
        this.points.clear();
        for (int i = 1; i < DnaAnalyzer.MUTANT_SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX() + i, startPoint.getPositionY()));
        }
    }

    public Boolean isSequence(String[] data) {
        return PointsAnalyzer.isSequence(data, startPoint, points);
    }
}
