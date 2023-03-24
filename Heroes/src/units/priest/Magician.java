package units.priest;

import units.abstr.Priest;

/**
 * Колдун
 */
public class Magician extends Priest {

    public Magician(String name, int team, int coordX, int coordY) {
        super(name, 30, 30, 17, -5, -5,
                8, 9, 10, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Чародей " + name;
    }
}
