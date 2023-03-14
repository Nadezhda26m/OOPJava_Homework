package units;

import java.util.ArrayList;

/**
 * Крестьянин
 */
public class Villager extends BaseHero {


    public Villager(String name, int team, int coordX, int coordY) {
        super(name, 1, 1, 1, 1, 1,
                1, 3, team, coordX, coordY);
    }

    @Override
    public String getInfo() {
        // return String.format("Фермер %s [HP:%d, Speed:%d]", name, hp, speed);
        return "Фермер " + name +
                " speed:" + speed +
                " hp:" + hp +
                " state:" + state;
    }

    @Override
    public String getUnitName() {
        return "Фермер " + name;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die")) return;
        state = "Stand";
    }


}
