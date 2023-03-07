package units;

public abstract class Warrior extends BaseHero {
    private int power;

    public Warrior(String name, int hp, int maxHp, int attack,
                   int damageMin, int damageMax, int defense, int speed, int power) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.power = power;
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
    }
}
