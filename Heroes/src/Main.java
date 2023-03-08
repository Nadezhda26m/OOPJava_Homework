import units.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> redTeam = new ArrayList<>();
        ArrayList<BaseHero> greenTeam = new ArrayList<>();
        int sizeTeam = 10, unit = 0;
        Random rand = new Random();
        int newUnit;

        while (unit < sizeTeam * 2) {
            if (unit++ < sizeTeam) {
                newUnit = rand.nextInt(4);
            } else {
                newUnit = rand.nextInt(4, 8);
            }
            switch (newUnit) {
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
                    greenTeam.add(new Arbalester(getName()));
                    break;
                case 5:
                    greenTeam.add(new Spearman(getName()));
                    break;
                case 6:
                    greenTeam.add(new Druid(getName()));
                    break;
                case 7:
                    greenTeam.add(new Villager(getName()));
                    break;
            }
        }

        ArrayList<BaseHero> commonList = new ArrayList<>(redTeam);
        commonList.addAll(greenTeam);
        Collections.sort(commonList);

        commonList.forEach(n -> System.out.println(n.getInfo()));
    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}


