import java.rmi.server.UnicastRemoteObject;

/*
StarCraft

Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
 */
public class Task2 {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();


        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        zerg1.name = "Zergik1";
        zerg2.name = "Zergik2";
        zerg3.name = "Zergik3";
        zerg4.name = "Zergik4";
        zerg5.name = "Zergik5";
        zerg6.name = "Zergik6";
        zerg7.name = "Zergik7";
        zerg8.name = "Zergik8";
        zerg9.name = "Zergik9";
        zerg10.name = "Zergik10";

        protos1.name = "Protos1";
        protos2.name = "Protos2";
        protos3.name = "Protos3";
        protos4.name = "Protos4";
        protos5.name = "Protos5";

        terran1.name = "Terran1";
        terran2.name = "Terran2";
        terran3.name = "Terran3";
        terran4.name = "Terran4";
        terran5.name = "Terran5";
        terran6.name = "Terran6";
        terran7.name = "Terran7";
        terran8.name = "Terran8";
        terran9.name = "Terran9";
        terran10.name = "Terran10";
        terran11.name = "Terran11";
        terran12.name = "Terran12";
    }
}

class Zerg {
    public String name;
}

class Protos {
    public String name;
}

class Terran {
    public String name;
}
