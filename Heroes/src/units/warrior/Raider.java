package units.warrior;

import units.abstr.Warrior;

/**
 * Разбойник
 */
public class Raider extends Warrior {

    public Raider(String name, int team, int coordX, int coordY) {
        super(name, 40, 40, 8, 2, 4,
                3, 6, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Разбойник " + name;
    }
}
