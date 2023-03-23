package units.noncombat;

import units.abstr.BaseHero;

import java.util.ArrayList;

/**
 * Крестьянин
 */
public class Villager extends BaseHero {


    public Villager(String name, int team, int coordX, int coordY) {
        super(name, 15, 15, 1, 1, 1,
                1, 3, team, coordX, coordY);
    }

    @Override
    public String getUnitName() {
        return "Фермер " + name;
    }

    @Override
    public boolean step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die")) return true;
        state = "Stand";
        return false;
    }
}
