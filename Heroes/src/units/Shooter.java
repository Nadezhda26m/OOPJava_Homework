package units;

public abstract class Shooter extends BaseHero {
    /**
     * Боеприпасы
     */
    protected int ammunition;

    public Shooter(String name, int hp, int maxHp, int attack,
                   int damageMin, int damageMax, int defense, int speed, int ammunition) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.ammunition = ammunition;
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
    }

}
