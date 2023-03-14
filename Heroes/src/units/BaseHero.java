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

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
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


}