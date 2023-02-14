package units;

public class Sniper extends Shooter {

    public Sniper(String heroID) {
        super(heroID, 10, 20, 30, 40);
    }
    @Override
    public String getInfo() {
        return "Снайпер " + heroID;
    }
}
