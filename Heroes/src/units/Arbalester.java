package units;

/**
 * Арбалетчик
 */
public class Arbalester extends Shooter {

    public Arbalester(String name) {
        super(name, 10, 10, 6, 2, 3,
                3, 4, 16);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Арбалетчик " + name;
    }
}
