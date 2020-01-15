package challenge.mutantes;

import java.util.Objects;

public class Point {
    private Integer positionX;
    private Integer positionY;

    public Point(Integer positionX, Integer positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(positionX, point.positionX) &&
                Objects.equals(positionY, point.positionY);
    }
}
