package units;

public abstract class Priest extends BaseHero {
    private int mana;

    public Priest(String heroID, int health, int endurance, int speed, int mana) {
        super(heroID, health, endurance, speed);
        this.mana = mana;
    }
}
