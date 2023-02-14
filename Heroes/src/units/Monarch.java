package units;

public class Monarch extends Priest {

    public Monarch(String heroID) {
        super(heroID, 11, 22, 33, 44);
    }

    @Override
    public String getInfo() {
        return "Монарх " + heroID;
    }
}
