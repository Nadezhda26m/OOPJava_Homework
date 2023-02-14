package units;

public class Arbalester extends Shooter {

    public Arbalester(String heroID) {
        super(heroID, 43, 12, 54, 32);
    }
    @Override
    public String getInfo() {
        return "Арбалетчик " + heroID;
    }
}
