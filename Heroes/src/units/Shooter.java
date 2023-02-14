package units;

public abstract class Shooter extends BaseHero{
    /**Боеприпасы*/
    protected int ammunition;

    public Shooter(String heroID, int health, int endurance, int speed, int ammunition) {
        super(heroID, health, endurance, speed);
        this.ammunition = ammunition;
    }

    protected boolean aiming() {
        if (endurance < 100) {
            return false;
        }
        else return true;
    }
}
