package units;

/**
 * Копейщик
 */
public class Spearman extends Warrior {

    public Spearman(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }
    @Override
    public String getInfo() {
        return "Копейщик " + name;
    }
}
