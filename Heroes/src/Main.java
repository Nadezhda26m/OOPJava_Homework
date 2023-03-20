import units.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int SIZE_TEAM = 8; // от 2
    public static ArrayList<BaseHero> redTeam, greenTeam, commonList;

    public static void main(String[] args) {

        redTeam = Team.create(1, SIZE_TEAM);
        greenTeam = Team.create(2, SIZE_TEAM);
        commonList = Team.merge(redTeam, greenTeam);
        Team.sort(commonList);
        Team.printFullInfo(commonList);

        String stop = "";

        Scanner scan = new Scanner(System.in);
        while (stop.equals("")) {
            View.view();
            for (BaseHero hero : commonList) {
                if (redTeam.contains(hero)) hero.step(redTeam, greenTeam);
                else hero.step(greenTeam, redTeam);
            }
            if (Team.isLoser(redTeam)) {
                View.view();
                System.out.println(">Победила команда greenTeam");
                break;
            } else if (Team.isLoser(greenTeam)) {
                View.view();
                System.out.println(">Победила команда redTeam");
                break;
            }
            Team.sort(commonList);
            stop = scan.nextLine();
        }
        System.out.println("Конец игры");
    }
}