package units;

/**
 * Арбалетчик
 */
public class Arbalester extends Shooter {


    public Arbalester(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }


    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}
