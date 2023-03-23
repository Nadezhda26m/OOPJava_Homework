package units.abstr;

import java.util.ArrayList;

public interface Interf {

    boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    String getInfo();
    String getUnitName();
}
