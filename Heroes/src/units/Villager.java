package units;

/**
 * Крестьянин
 */
public class Villager extends BaseHero {


    public Villager(String name) {
        super(name, 10, 10, 1, 2, 3, 4, 5);
    }

    @Override
    public String getInfo() {
        return "Фермер " + name; // крестьянин
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
        // если не труп то state = "Stand"
    }
}
