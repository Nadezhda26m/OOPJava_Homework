package units;

/**
 * Копейщик
 */
public class Spearman extends Warrior {

    public Spearman(String name, int team, int coordX, int coordY) {
        super(name, 40, 40, 1, 2, 3,
                4, 4, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state;
    }

    @Override
    public String getUnitName() {
        return "Копейщик " + name;
    }
}
