package units;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name) {
        super(name, 15, 15, 12, 8, 10,
                10, 9, 32);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Снайпер " + name;
    }
}
