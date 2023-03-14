package units;

import java.util.ArrayList;

public abstract class Priest extends BaseHero {
    private int mana;

    public Priest(String name, int hp, int maxHp, int attack,int damageMin, int damageMax,
                  int defense, int speed, int mana, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // System.out.println("Ход жреца");
    }
}
