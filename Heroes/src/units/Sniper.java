package units;

/**
 * Снайпер
 */
public class Sniper extends Shooter {


    public Sniper(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5, 6);
    }


    @Override
    public String getInfo() {
        return "Снайпер " + name;
    }


}
