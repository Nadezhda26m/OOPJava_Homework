import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> redTeam = new ArrayList<>();
        int sizeTeam = 10, unit = 0;
        Random rand = new Random();

        while (unit++ < sizeTeam) {
            switch (rand.nextInt(7)) {
                case 0:
                    redTeam.add(new Sniper(getName()));
                    break;
                case 1:
                    redTeam.add(new Raider(getName()));
                    break;
                case 2:
                    redTeam.add(new Magician(getName()));
                    break;
                case 3:
                    redTeam.add(new Villager(getName()));
                    break;
                case 4:
                    redTeam.add(new Arbalester(getName()));
                    break;
                case 5:
                    redTeam.add(new Spearman(getName()));
                    break;
                case 6:
                    redTeam.add(new Druid(getName()));
                    break;
            }
        }

        for (BaseHero hero : redTeam) {
            System.out.println(hero.getInfo());
        }

    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}


