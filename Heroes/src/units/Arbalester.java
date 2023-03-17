package units;

/**
 * Арбалетчик
 */
public class Arbalester extends Shooter {

    public Arbalester(String name, int team, int coordX, int coordY) {
        super(name, 25, 25, 6, 2, 3,
                3, 4, 16, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state +
                " стрелы:" + ammunition;
    }

    @Override
    public String getUnitName() {
        return "Арбалетчик " + name;
    }
}
