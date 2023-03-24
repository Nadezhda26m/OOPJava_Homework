package units.abstr;

import java.util.ArrayList;

public abstract class Warrior extends BaseHero {

    public Warrior(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                   int defense, int speed, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die")) return;
        int index = findNearest(enemy);
        if (index == -1) return; // все враги мертвы, но не все свои сходили
        BaseHero target = enemy.get(index);
        if (coord.getDistance(target.coord) < 2) {
            target.getDamage(calculateDamage(target.defense));
        } else {
            Point2D way = coord.getWay(target.coord);
            if (Math.abs(way.y) > Math.abs(way.x)) {
                if (way.y < 0 && noObstacle(coord.x, coord.y + 1, friend)) {
                    coord.y++;
                    return;
                } else if (way.y > 0 && noObstacle(coord.x, coord.y - 1, friend)) {
                    coord.y--;
                    return;
                }
            } // лучше идти по X или есть препятствие по Y
            // (пропускает ход при наличии препятствия по X)
            if (way.x < 0 && noObstacle(coord.x + 1, coord.y, friend)) coord.x++;
            else if (way.x > 0 && noObstacle(coord.x - 1, coord.y, friend)) coord.x--;
        }
    }

    private float calculateDamage(int targetDefense) {
        int a = targetDefense - attack;
        return a < 0 ? damageMax
                : a > 0 ? damageMin
                : (float) (damageMax + damageMin) / 2;
    }

    private boolean noObstacle(int posX, int posY, ArrayList<BaseHero> friend) {
        for (BaseHero hero : friend) {
            if (!hero.state.equals("Die")
                    && hero.coord.x == posX && hero.coord.y == posY) return false;
        }
        return true;
    }
}
