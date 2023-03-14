package units;

/**
 * Колдун
 */
public class Magician extends Priest {

    public Magician(String name, int team, int coordX, int coordY) {
        super(name, 30, 30, 17, -5, -5,
                12, 9, 10, team, coordX, coordY);
    }
    @Override
    public String getInfo() {
        return "Чародей " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state;
    }

    @Override
    public String getUnitName() {
        return "Чародей " + name;
    }
}
