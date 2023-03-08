package units;

/**
 * Разбойник
 */
public class Raider extends Warrior {

    public Raider(String name) {
        super(name, 10, 10, 8, 2, 4,
                3, 6);
    }

    @Override
    public String getInfo() {
        return "Разбойник " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Разбойник " + name;
    }
}
