package units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {
    /**
     * Боеприпасы
     */
    protected int ammunition;

    public Shooter(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                   int defense, int speed, int ammunition, int team, int coordX, int coordY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, team, coordX, coordY);
        this.ammunition = ammunition;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // System.out.println("Стрелок");
        if (hp == 0) state = "Die";
        if (state.equals("Die") || ammunition == 0) return;
        // свой - чужой
        ArrayList<BaseHero> enemy, friend;
        if (team == 1) {
            friend = team1;
            enemy = team2;
        } else {
            friend = team2;
            enemy = team1;
        }
        // цель атаки
        BaseHero target = coord.findNearest(coord, enemy);
        int a = target.defense - attack;
        if (a < 0) {
            target.hp -= damageMax;
        } else if (a == 0) {
            target.hp -= (damageMax + damageMin) / 2;
        } else {
            target.hp -= damageMin;
        }
        if (target.hp <= 0) {
            target.hp = 0;
            target.state = "Die";
        }
        // поиск фермера
        boolean haveFarmer = false;
        for (BaseHero hero : friend) {
            if (hero.getUnitName().split(" ")[0].equals("Фермер")
                    && hero.state.equals("Stand")) {
                hero.state = "Busy";
                haveFarmer = true;
                break;
            }
        }
        if (!haveFarmer) ammunition -= 1;
    }

}
