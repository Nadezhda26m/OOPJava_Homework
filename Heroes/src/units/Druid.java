package units;

/**
 * Монарх
 */
public class Druid extends Priest {
    public Druid(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }



    @Override
    public String getInfo() {
        return "Друид " + name; // Монарх
    }
}
