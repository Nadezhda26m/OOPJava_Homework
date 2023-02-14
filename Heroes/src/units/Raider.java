package units;

public class Raider extends Warrior {

    public Raider(String heroID) {
        super(heroID, 21, 32, 43, 54);
    }
    @Override
    public String getInfo() {
        return "Разбойник " + heroID;
    }
}
