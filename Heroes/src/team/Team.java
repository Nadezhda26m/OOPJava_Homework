package team;

import units.*;
import units.priest.*;
import units.shooter.*;
import units.warrior.*;
import units.noncombat.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Team {

    public static ArrayList<BaseHero> create(int side, int sizeTeam) {
        if (side == 1) return create(side, sizeTeam, 1, 0, 4);
        return create(side, sizeTeam, 10, 3, 7);
    }

    private static ArrayList<BaseHero> create(int side, int sizeTeam, int coordX,
                                              int randMin, int randMax) {
        ArrayList<BaseHero> team = new ArrayList<>();
        Random rand = new Random();
        int count = 0, unit;
        while (count++ < sizeTeam) {
            unit = rand.nextInt(randMin, randMax);
            switch (unit) {
                case 0 -> team.add(new Sniper(getName(), side, coordX, count));
                case 1 -> team.add(new Raider(getName(), side, coordX, count));
                case 2 -> team.add(new Magician(getName(), side, coordX, count));
                case 3 -> team.add(new Villager(getName(), side, coordX, count));
                case 4 -> team.add(new Arbalester(getName(), side, coordX, count));
                case 5 -> team.add(new Spearman(getName(), side, coordX, count));
                case 6 -> team.add(new Druid(getName(), side, coordX, count));
            }
        }
        return team;
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    // Вывод полной информации о героях
    public static void printFullInfo(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getInfo()));
    }

    // Вывод типа и имени героя
    public static void printUnits(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getUnitName()));
    }

    public static ArrayList<BaseHero> merge(ArrayList<BaseHero> team1,
                                            ArrayList<BaseHero> team2) {
        ArrayList<BaseHero> commonList = new ArrayList<>(team1);
        commonList.addAll(team2);
        return commonList;
    }

    public static void sort(ArrayList<BaseHero> team) {
        Collections.sort(team);
    }

    private static boolean isLoser(ArrayList<BaseHero> team) {
        for (BaseHero hero : team) {
            if (!hero.getState().equals("Die")) return false;
        }
        return true;
    }

    public static int findWinner(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (isLoser(team1)) return 2;
        if (isLoser(team2)) return 1;
        return 0;
    }
}
