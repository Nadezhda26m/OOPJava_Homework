package units;

import java.util.ArrayList;

public abstract class BaseHero implements Interf, Comparable<BaseHero> {
    protected static int heroID = 1;
    protected String name;
    protected int hp, maxHp, team;
    protected int attack, damageMin, damageMax, defense, speed;
    protected String state;
    protected Point2D coord;

    public BaseHero(String name, int hp, int maxHp, int attack, int damageMin, int damageMax,
                    int defense, int speed, int team, int coordX, int coordY) {
        this.name = name + "_" + heroID++;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        this.team = team;
        state = "Stand";
        coord = new Point2D(coordX, coordY);
    }

    public String getState() {
        return state;
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
    }

    @Override
    public String getInfo() {
        return "null";
    }

    @Override
    public String getUnitName() {
        return "null";
    }

    @Override
    public int compareTo(BaseHero o) {
        if(o.speed == this.speed) return o.hp - this.hp;
        return o.speed - this.speed;
    }

    protected int findNearest(ArrayList<BaseHero> team) {
        double minDist = 1000;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).hp > 0 && coord.getDistance(team.get(i).coord) < minDist) {
                minDist = coord.getDistance(team.get(i).coord);
                index = i;
            }
        }
        return index;
    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        } else if (hp > maxHp) hp = maxHp;
    }

    public int[] getCoord() {
        return new int[]{coord.x, coord.y};
    }

}