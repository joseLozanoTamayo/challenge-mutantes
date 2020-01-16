package challenge.mutantes;

public class RightDiagonalFinder extends Finder {
    public RightDiagonalFinder(Point point) {
        super(point);
    }

    public RightDiagonalFinder() {
        super();
    }

    @Override
    protected void generatePoints(Point startPoint) {
        this.points.clear();
        for (int i = 1; i < DnaAnalyzer.MUTANT_SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX() + i, startPoint.getPositionY() + i));
        }
    }
}
