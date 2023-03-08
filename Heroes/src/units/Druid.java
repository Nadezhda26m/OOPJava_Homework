package units;

/**
 * Монах
 */
public class Druid extends Priest {

    public Druid(String name) {
        super(name, 30, 30, 12, -4, -4,
                7, 5, 10);
    }

    @Override
    public String getInfo() {
        return "Друид " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Друид " + name;
    }
}
