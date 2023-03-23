package units.abstr;

import java.util.ArrayList;

public abstract class Priest extends BaseHero {
    private int mana;

    public Priest(String name, int hp, int maxHp, int attack,int damageMin, int damageMax,
                  int defense, int speed, int mana, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Mana:" + mana;
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        // сделать восстановление маны
        if (state.equals("Die") || mana == 0) return;
        BaseHero target = getWounded(friend);
        if (getDamageCondition(target) > 0.2f || target.hp - damageMax <= target.maxHp) {
            target.getDamage(damageMax);
            mana--;
        }
    }

    private BaseHero getWounded(ArrayList<BaseHero> team) {
        int index = 0;
        float badCondition = 0;
        for (int i = 0; i < team.size(); i++) {
            if (!team.get(i).state.equals("Die")
                    && getDamageCondition(team.get(i)) >= badCondition) {
                badCondition = getDamageCondition(team.get(i));
                index = i;
            }
        }
        return team.get(index);
    }

    private float getDamageCondition(BaseHero hero) {
        return (float) ((hero.maxHp - hero.hp) / hero.maxHp);
    }
}
