package units;

import java.util.Comparator;

public class SpeedSort implements Comparator<BaseHero> {
    @Override
    public int compare(BaseHero o1, BaseHero o2) {
        if (o2.speed == o1.speed) {
            return o2.hp - o1.hp;
            // return Integer.compare(o2.hp, o1.hp);
        } else {
            return o2.speed - o1.speed;
            // return Integer.compare(o2.speed, o1.speed);
        }
    }
}
