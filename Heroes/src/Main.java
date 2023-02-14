import units.*;

public class Main {
    public static void main(String[] args) {
        Sniper name1 = new Sniper("Tom1");
        System.out.println(name1.getInfo());
        Arbalester name2 = new Arbalester("Tom2");
        System.out.println(name2.getInfo());
        Spearman name3 = new Spearman("Tom3");
        System.out.println(name3.getInfo());
        Raider name4 = new Raider("Tom4");
        System.out.println(name4.getInfo());
        Magician name5 = new Magician("Tom5");
        System.out.println(name5.getInfo());
        Monarch name6 = new Monarch("Tom6");
        System.out.println(name6.getInfo());
        Villager name7 = new Villager("Tom7");
        System.out.println(name7.getInfo());

    }
}
