package units;

/**
 * Монах
 */
public class Druid extends Priest {

    public Druid(String name, int team, int coordX, int coordY) {
        super(name, 30, 30, 12, -4, -4,
                7, 5, 10, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Друид " + name;
    }
}
