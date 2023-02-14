package units;

public class Magician extends Priest {

    public Magician(String heroID) {
        super(heroID, 12, 23, 34, 45);
    }
    @Override
    public String getInfo() {
        return "Колдун " + heroID;
    }
}
