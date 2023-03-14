import units.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sizeTeam = 10;
        ArrayList<BaseHero> redTeam = Team.createTeam(1, sizeTeam);
        ArrayList<BaseHero> greenTeam = Team.createTeam(2, sizeTeam);
        ArrayList<BaseHero> commonList = Team.mergeTeams(redTeam, greenTeam);
        Collections.sort(commonList);
        Team.printTeamInfo(commonList);

        String stop = "";
        Scanner scan = new Scanner(System.in);
        while (stop.equals("")) {
            Team.doStep(redTeam, greenTeam, commonList);
            stop = scan.nextLine();
        }
    }
}