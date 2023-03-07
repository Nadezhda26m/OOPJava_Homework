package units;

/**
 * Разбойник
 */
public class Raider extends Warrior {

    public Raider(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }
    @Override
    public String getInfo() {
        return "Разбойник " + name;
    }
}
