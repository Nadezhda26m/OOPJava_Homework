import units.BaseHero;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int SIZE_TEAM = Main.SIZE_TEAM;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("",
            Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("",
            Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("",
            Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%" + dif + "s", ":\t");
        else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (BaseHero human: Main.commonList) {
            if (human.getCoord()[0] == y && human.getCoord()[1] == x){
                if (human.getState().equals("Die")) {
                    out = "|" + (AnsiColors.ANSI_PURPLE + human.getUnitName().charAt(0)
                            + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.redTeam.contains(human)) out = "|" + (AnsiColors.ANSI_RED
                        + human.getUnitName().charAt(0) + AnsiColors.ANSI_RESET);
                if (Main.greenTeam.contains(human)) out = "|" + (AnsiColors.ANSI_GREEN
                        + human.getUnitName().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_YELLOW + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_YELLOW + "Step: " + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.commonList.forEach((v) -> l[0] = Math.max(l[0], v.getInfo().length()));
        System.out.print("_".repeat(l[0]*2 + 10));
        System.out.println("");
        System.out.print(" ".repeat(top10.length() + 3) + "Red side");
        System.out.print(" ".repeat(l[0]-8));
        System.out.println(":\tGreen side");
        System.out.println(top10);//
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|   ");
        System.out.print(Main.redTeam.get(0).getInfo());
        tabSetter(Main.redTeam.get(0).getInfo().length(), l[0]);
        System.out.println(Main.greenTeam.get(0).getInfo());
        System.out.println(midl10);

        for (int i = 2; i < SIZE_TEAM; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|   ");
            System.out.print(Main.redTeam.get(i-1).getInfo());
            tabSetter(Main.redTeam.get(i-1).getInfo().length(), l[0]);
            System.out.println(Main.greenTeam.get(i-1).getInfo());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(SIZE_TEAM, j));
        }
        System.out.print("|   ");
        System.out.print(Main.redTeam.get(SIZE_TEAM-1).getInfo());
        tabSetter(Main.redTeam.get(SIZE_TEAM-1).getInfo().length(), l[0]);
        System.out.println(Main.greenTeam.get(SIZE_TEAM-1).getInfo());
        System.out.println(bottom10);
    }
}