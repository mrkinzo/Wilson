package operacoes;
import java.util.ArrayList;
import java.util.Scanner;
import classesConceituais.*;

public class MineralDB {

    final static Scanner LER = new Scanner(System.in);

    static ArrayList<Mineral> mineralLog = new ArrayList<>();

    public static void removeFromLog() {
        System.out.println("where ?");
        int k = LER.nextInt();
        mineralLog.remove(k);
    }

    public static void editFromLog() {
        System.out.println("Where and What?");
        int o = LER.nextInt();
        Mineral steve = new Mineral();
        OperacoesM.setMineralProperties(steve);
        mineralLog.set(o, steve);
    }

    public static void addToLog(Mineral mineral) {
        mineralLog.add(mineral);
    }

    public static void PrintDB() {
        for (Mineral mineral : mineralLog) {
            System.out.println("Mineral Name: " + mineral.getName());
            System.out.println("Color: " + mineral.getColor());
            System.out.println("Chemical Composition: " + mineral.getComposition());
            System.out.println();
            System.out.println("------------Site Info--------------");
            System.out.println();
            System.out.println("Site name: " + mineral.getSite().getName());
            System.out.println("Site city: " + mineral.getSite().getCity());
            System.out.println("Site country: " + mineral.getSite().getCountry());
            System.out.println("Site ID: " + mineral.getSite().getsId());
             System.out.println("Is Visitable: " + mineral.getSite().isVisitable());
             System.out.println("---------------------------------");
            System.out.println("Toxicity Level: " + mineral.getToxicityLevel());
            System.out.println("Hardness (Mohs scale): " + mineral.getDureza());
            System.out.println("Brightness (Luster): " + mineral.getBrightness());

        }
    }
}
