package units;

import java.util.ArrayList;

public class Point2D {
    protected int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected double distance(Point2D point1, Point2D point2) {
        return Math.sqrt((point1.x - point2.x)^2 + (point1.y - point2.y)^2);
    }

    protected BaseHero findNearest(Point2D hero, ArrayList<BaseHero> team) {
        double minDist = Double.MAX_VALUE;
        double dist;
        BaseHero target = team.get(0);
        for (BaseHero unit : team) {
            dist = distance(hero, unit.coord);
            if (dist < minDist && !unit.state.equals("Die")) {
                minDist = dist;
                target = unit;
            }
        }
        return target;
    }


}
