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

        Scanner scan = new Scanner(System.in);
        int winner = 0;
        View.view();
        while (winner == 0) {
            scan.nextLine();
            Team.sort(commonList);
            for (BaseHero hero : commonList) {
                if (redTeam.contains(hero)) hero.step(redTeam, greenTeam);
                else hero.step(greenTeam, redTeam);
            }
            View.view();
            winner = Team.findWinner(redTeam, greenTeam);
        }

        if (winner == 1) System.out.println(">Победила команда redTeam");
        else System.out.println(">Победила команда greenTeam");
        System.out.println("Конец игры");
    }
}