package challenge.mutantes.Utils;

public class HorizontalFinder extends Finder {
    public HorizontalFinder(Point point) {
        super(point);
    }

    public HorizontalFinder() {
        super();
    }

    @Override
    public void generatePoints(Point startPoint) {
        this.points.clear();
        for (int i = 1; i < DnaAnalyzer.MUTANT_SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX() + i, startPoint.getPositionY()));
        }
    }
}
