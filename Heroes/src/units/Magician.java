package units;

/**
 * Колдун
 */
public class Magician extends Priest {

    public Magician(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }
    @Override
    public String getInfo() {
        return "Чародей " + name; // Колдун
    }
}
