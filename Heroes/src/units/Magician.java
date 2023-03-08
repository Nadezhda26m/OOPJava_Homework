package units;

/**
 * Колдун
 */
public class Magician extends Priest {

    public Magician(String name) {
        super(name, 30, 30, 17, -5, -5,
                12, 9, 10);
    }
    @Override
    public String getInfo() {
        return "Чародей " + name +
                " speed:" + speed +
                " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Чародей " + name;
    }
}
