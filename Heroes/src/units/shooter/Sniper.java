package units.shooter;

import units.abstr.Shooter;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name, int team, int coordX, int coordY) {
        super(name, 30, 30, 12, 8, 10,
                10, 9, 32, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Снайпер " + name;
    }
}
