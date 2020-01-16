package challenge.mutantes;

import java.util.ArrayList;

public abstract class Finder {
    protected Point startPoint;
    protected ArrayList<Point> points;

    public Finder(Point startPoint) {
        points = new ArrayList<>();
        setStartPoint(startPoint);
    }

    public Finder() {
        this(new Point());
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        generatePoints(startPoint);
    }

    protected abstract void generatePoints(Point startPoint);

    public Boolean isSequence(String[] data) {
        return PointsAnalyzer.isSequence(data, startPoint, points);
    }
}
