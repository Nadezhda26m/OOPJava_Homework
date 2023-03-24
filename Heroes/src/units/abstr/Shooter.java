package units.abstr;

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
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die")) return;
        for (BaseHero hero : friend) { // поиск фермера
            if (hero.getUnitName().charAt(0) == 'Ф'
                    && hero.state.equals("Stand")) {
                ammunition++; // если освободился фермер после окончания стрел
                hero.state = "Busy";
                break;
            }
        }
        int index = findNearest(enemy);
        if (ammunition > 0 && index != -1) {
            BaseHero target = enemy.get(index); // цель атаки
            target.getDamage(calculateDamage(target.defense, coord.getDistance(target.coord)));
            ammunition--;
        }
    }

    private float calculateDamage(int targetDefense, double distance) {
        float damage;
        if (targetDefense - attack < 0) damage = damageMax;
        else if (targetDefense - attack == 0) damage = (float) (damageMax + damageMin) / 2;
        else damage = damageMin;

        if (distance < 3) damage += 2;
        else if (distance > 6 && distance < 11) {
            if (damage >= 3) damage -= 2;
            else damage = 1;
        } else if (distance >= 11) damage /= 2;

        return damage;

        // return (targetDefense - attack) < 0 ? damageMax
        //         : (targetDefense - attack) > 0 ? damageMin
        //         : (float) (damageMax + damageMin) / 2;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Shots:" + ammunition;
    }
}
