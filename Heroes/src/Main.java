import units.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int SIZE_TEAM = 5;

    public static void main(String[] args) {

        ArrayList<BaseHero> redTeam = Team.create(1, SIZE_TEAM);
        ArrayList<BaseHero> greenTeam = Team.create(2, SIZE_TEAM);
        ArrayList<BaseHero> commonList = Team.merge(redTeam, greenTeam);
        Team.sort(commonList);
        Team.printFullInfo(commonList);

        String stop = "";
        Scanner scan = new Scanner(System.in);
        while (stop.equals("")) {
            for (BaseHero hero : commonList) {
                if (redTeam.contains(hero)) hero.step(redTeam, greenTeam);
                else hero.step(greenTeam, redTeam);
            }
            if (Team.isLoser(redTeam)) {
                System.out.println(">Победила команда greenTeam");
                break;
            } else if (Team.isLoser(greenTeam)) {
                System.out.println(">Победила команда redTeam");
                break;
            }
            Team.sort(commonList);
            System.out.println();
            Team.printFullInfo(commonList);
            stop = scan.nextLine();
        }
        System.out.println("Конец игры");
    }
}