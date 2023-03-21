package main;

import units.*;
import team.*;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final int SIZE_TEAM = 8; // от 2
    public static ArrayList<BaseHero> redTeam, greenTeam, commonList;

    public static void main(String[] args) {

        redTeam = Team.create(1, SIZE_TEAM);
        greenTeam = Team.create(2, SIZE_TEAM);
        commonList = Team.merge(redTeam, greenTeam);
        Team.sort(commonList);
        Team.printFullInfo(commonList);

        int winner;
        Scanner scan = new Scanner(System.in);
        while (true) {
            View.view();
            for (BaseHero hero : commonList) {
                if (redTeam.contains(hero)) hero.step(redTeam, greenTeam);
                else hero.step(greenTeam, redTeam);
            }
            winner = Team.findWinner(redTeam, greenTeam);
            if (winner != 0) break;
            Team.sort(commonList);
            scan.nextLine();
        }
        View.view();
        if (winner == 1) System.out.println(">Победила команда redTeam");
        else System.out.println(">Победила команда greenTeam");
        System.out.println("Конец игры");
    }
}