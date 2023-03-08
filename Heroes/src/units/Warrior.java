package units;

public abstract class Warrior extends BaseHero {

    public Warrior(String name, int hp, int maxHp, int attack,
                   int damageMin, int damageMax, int defense, int speed) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
    }
}
