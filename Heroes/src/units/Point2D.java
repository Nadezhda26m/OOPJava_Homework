package units;

public class Point2D {
    protected int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected double getDistance(Point2D opponent) {
        return Math.sqrt(Math.pow((x - opponent.x), 2) + Math.pow((y - opponent.y), 2));
    }

}
