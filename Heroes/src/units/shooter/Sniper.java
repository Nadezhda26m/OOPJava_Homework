package units.shooter;

import units.abstr.Shooter;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name, int team, int coordX, int coordY) {
        super(name, 30, 30, 12, 5, 8,
                5, 9, 32, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Снайпер " + name;
    }
}
