
import java.util.ArrayList;
import java.util.Scanner;

public class RocksDb {
    final static Scanner LER = new Scanner(System.in);
    static ArrayList<Rock> rockLog = new ArrayList<>();

    public static void removeFromLog() {
        System.out.println("where ?");
        int k = LER.nextInt();
        rockLog.remove(k);
    }

    public static void editFromLog() {
        System.out.println("Where and What?");
        int o = LER.nextInt();
        Rock simba = new Rock();
        OperacoesR.setRockProperties(simba);
        rockLog.set(o, simba);
    }

    public static void addToLog(Rock rock) {
        rockLog.add(rock);
    }

    public static void PrintDB() {
        for (Rock rock : rockLog) {
            System.out.println("Rock Name: " + rock.getName());
            System.out.println("Rock Type: " + rock.getType());
            System.out.println("Rock Hardness (Dureza): " + rock.getDureza());
            System.out.println();
            System.out.println("------------Site Info--------------");
            System.out.println();
            System.out.println("Site name: " + rock.getSite().getName());
            System.out.println("Site city: " + rock.getSite().getCity());
            System.out.println("Site country: " + rock.getSite().getCountry());
            System.out.println("Site ID: " + rock.getSite().getsId());
             System.out.println("Is Visitable: " + rock.getSite().isVisitable());
             System.out.println("---------------------------------");
            System.out.println("Is it a Gem?: " + rock.isGem());

        }
    }
}
