package challenge.mutantes;

public class LeftDiagonalFinder extends Finder {
    public LeftDiagonalFinder(Point point) {
        super(point);
    }

    public LeftDiagonalFinder() {
        super();
    }

    @Override
    protected void generatePoints(Point startPoint) {
        this.points.clear();
        for (int i = 1; i < DnaAnalyzer.MUTANT_SEQUENCE_LENGTH; i++) {
            points.add(new Point(startPoint.getPositionX() - i, startPoint.getPositionY() + i));
        }
    }
}
