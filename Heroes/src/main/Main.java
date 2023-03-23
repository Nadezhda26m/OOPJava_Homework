package main;

import units.abstr.BaseHero;
import team.Team;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final int SIZE_TEAM = 10; // от 2
    public static ArrayList<BaseHero> redTeam, greenTeam, commonList;

    public static void main(String[] args) {

        redTeam = Team.create(1, SIZE_TEAM);
        greenTeam = Team.create(2, SIZE_TEAM);
        commonList = Team.merge(redTeam, greenTeam);
        Team.sort(commonList);
        Team.printFullInfo(commonList);

        int winner;
        Scanner scan = new Scanner(System.in);
        View.view();
        scan.nextLine();
        while (true) {
            for (BaseHero hero : commonList) {
                if (redTeam.contains(hero)) hero.step(redTeam, greenTeam);
                else hero.step(greenTeam, redTeam);
            }
            View.view();
            winner = Team.findWinner(redTeam, greenTeam);
            if (winner != 0) break;
            Team.sort(commonList);
            scan.nextLine();
        }
        if (winner == 1) System.out.println(">Победила команда redTeam");
        else System.out.println(">Победила команда greenTeam");
        System.out.println("Конец игры");
    }
}