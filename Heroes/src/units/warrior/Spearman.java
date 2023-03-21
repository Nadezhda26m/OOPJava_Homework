package units.warrior;

import units.abstr.Warrior;

/**
 * Копейщик
 */
public class Spearman extends Warrior {

    public Spearman(String name, int team, int coordX, int coordY) {
        super(name, 40, 40, 1, 2, 3,
                4, 4, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Копейщик " + name;
    }
}
