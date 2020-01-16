package challenge.mutantes;

public class VerticalFinder extends Finder{
    public VerticalFinder(Point point) {
        super(point);
    }

    public VerticalFinder() {
        super();
    }

    @Override
    public void generatePoints(Point startPoint) {
        this.points.clear();
        for (int i = 1; i < DnaAnalyzer.MUTANT_SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX(), startPoint.getPositionY() + i));
        }
    }
}
