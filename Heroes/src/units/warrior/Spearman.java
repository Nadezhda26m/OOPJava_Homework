package units.warrior;

import units.abstr.Warrior;

/**
 * Копейщик
 */
public class Spearman extends Warrior {

    public Spearman(String name, int team, int coordX, int coordY) {
        super(name, 50, 50, 2, 3, 6,
                12, 4, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Копейщик " + name;
    }
}
