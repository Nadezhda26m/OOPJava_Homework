package units;

public abstract class BaseHero implements Interf {
    protected static int heroID = 1;
    protected String name;
    protected int hp, maxHp;
    protected int attack, damageMin, damageMax, defense, speed;
    protected String state;

    public BaseHero(String name, int hp, int maxHp, int attack,
                    int damageMin, int damageMax, int defense, int speed) {
        this.name = name + "_" + heroID++;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        state = "Stand";
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "null";
    }

    @Override
    public String getUnitName() {
        return "null";
    }

}