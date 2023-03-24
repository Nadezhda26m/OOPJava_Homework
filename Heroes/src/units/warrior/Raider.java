package units.warrior;

import units.abstr.Warrior;

/**
 * Разбойник
 */
public class Raider extends Warrior {

    public Raider(String name, int team, int coordX, int coordY) {
        super(name, 50, 50, 8, 5, 9,
                14, 6, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Разбойник " + name;
    }
}
