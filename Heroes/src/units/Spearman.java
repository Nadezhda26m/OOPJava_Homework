package units;

/**
 * Копейщик
 */
public class Spearman extends Warrior {

    public Spearman(String name) {
        super(name, 10, 10, 1, 2, 3,
                4, 4);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Копейщик " + name;
    }
}
