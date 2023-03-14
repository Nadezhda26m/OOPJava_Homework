package units;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name, int team, int coordX, int coordY) {
        super(name, 15, 15, 12, 8, 10,
                10, 9, 32, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state +
                " стрелы:" + ammunition;
    }

    @Override
    public String getUnitName() {
        return "Снайпер " + name;
    }
}
