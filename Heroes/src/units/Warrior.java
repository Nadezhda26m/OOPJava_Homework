package units;

import java.util.ArrayList;

public abstract class Warrior extends BaseHero {

    public Warrior(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                   int defense, int speed, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        // System.out.println("Ход воина");
    }
}
