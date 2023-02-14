package units;

public abstract class Warrior extends BaseHero {
    private int power;

    public Warrior(String heroID, int health, int endurance, int speed, int power) {
        super(heroID, health, endurance, speed);
        this.power = power;
    }
}
