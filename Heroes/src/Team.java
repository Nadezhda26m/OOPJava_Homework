import units.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Team {

    public static ArrayList<BaseHero> createTeam(int side, int sizeTeam) {
        if (side == 1) return createTeam(side, sizeTeam, 1, 0, 4);
        return createTeam(side, sizeTeam, 10, 3, 7);
    }

    private static ArrayList<BaseHero> createTeam(int side, int sizeTeam, int coordX,
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
    public static void printTeamInfo(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getInfo()));
    }

    // Вывод типа и имени героя
    public static void printTeamUnits(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getUnitName()));
    }

    public static ArrayList<BaseHero> mergeTeams(ArrayList<BaseHero> team1,
                                                 ArrayList<BaseHero> team2) {
        ArrayList<BaseHero> commonList = new ArrayList<>(team1);
        commonList.addAll(team2);
        return commonList;
    }

    public static void doStep(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2,
                              ArrayList<BaseHero> commonList) {
        commonList.forEach(n -> n.step(team1, team2));
        Collections.sort(commonList);
        System.out.println("redTeam");
        Collections.sort(team1);
        printTeamInfo(team1);
        System.out.println("greenTeam");
        Collections.sort(team2);
        printTeamInfo(team2);
    }
}
