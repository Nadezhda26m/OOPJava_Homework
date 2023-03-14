package units;

/**
 * Разбойник
 */
public class Raider extends Warrior {

    public Raider(String name, int team, int coordX, int coordY) {
        super(name, 10, 10, 8, 2, 4,
                3, 6, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        return "Разбойник " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state;
    }

    @Override
    public String getUnitName() {
        return "Разбойник " + name;
    }
}
