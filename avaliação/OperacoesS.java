

import java.util.Scanner;

public class OperacoesS extends Site {
    final static Scanner LER = new Scanner(System.in);

    public static Site InsertInfoS() {
        Site site = new Site();
        System.out.println("insert city");
        site.setCity(LER.next());
        System.out.println("insert country");
        site.setCountry(LER.next());
        System.out.println("insert the sites name ");
        site.setName(LER.next());
        System.out.println("insert the sites ID");
        site.setsId(LER.nextInt());
        System.out.println("insert if it's open for vistitation (important)");
        site.setVisitable(LER.nextBoolean());
        return site;
    }
}
