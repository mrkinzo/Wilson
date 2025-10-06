
import java.util.Scanner;


public class OperacoesM {
    final static Scanner LER = new Scanner(System.in);

    public static void setMineralProperties(Mineral mineral) {

        System.out.println("Enter mineral name:");
        mineral.setName(LER.next());

        System.out.println("Enter mineral hardness (float):");
        Dureza h = new Dureza(LER.nextFloat());
        mineral.setDureza(h);

        System.out.println("Enter mineral composition:");
        mineral.setComposition(LER.next());

        System.out.println("Enter mineral brightness:");
        mineral.setBrightness(LER.next());

        System.out.println("Enter mineral color:");
        mineral.setColor(LER.next());

        System.out.println("Enter mineral toxicity level:");
        mineral.setToxicityLevel(LER.nextInt());

        System.out.println("Enter site information:");
        // The OperacoesS.InsertInfoS() method should read all the site's data.
        mineral.setSite(OperacoesS.InsertInfoS());
    }
}