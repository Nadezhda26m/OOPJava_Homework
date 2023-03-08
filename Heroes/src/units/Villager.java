package units;

/**
 * Крестьянин
 */
public class Villager extends BaseHero {


    public Villager(String name) {
        super(name, 1, 1, 1, 1, 1,
                1, 3);
    }

    @Override
    public String getInfo() {
        return String.format("Фермер %s [HP:%d, Speed:%d]", name, hp, speed);
        // return "Фермер " + name +
        //         " speed:" + speed +
        //         " hp:" + hp;
    }

    @Override
    public String getUnitName() {
        return "Фермер " + name;
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
        // если не труп то state = "Stand"
    }


}
