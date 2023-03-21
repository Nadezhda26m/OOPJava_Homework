package units.shooter;

import units.abstr.Shooter;

/**
 * Арбалетчик
 */
public class Arbalester extends Shooter {

    public Arbalester(String name, int team, int coordX, int coordY) {
        super(name, 25, 25, 9, 4, 6,
                3, 4, 16, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Арбалетчик " + name;
    }
}
