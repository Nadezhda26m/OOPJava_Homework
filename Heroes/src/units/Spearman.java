package units;

public class Spearman extends Warrior {

    public Spearman(String heroID) {
        super(heroID, 64, 43, 32, 43);
    }
    @Override
    public String getInfo() {
        return "Копейщик " + heroID;
    }
}
