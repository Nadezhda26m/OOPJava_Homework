package units;

public abstract class Priest extends BaseHero {
    private int mana;

    public Priest(String name, int hp, int maxHp, int attack,
                  int damageMin, int damageMax, int defense, int speed, int mana) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.mana = mana;
    }

    @Override
    public void step() {
        System.out.println("Ну, я пошел...");
    }
}
