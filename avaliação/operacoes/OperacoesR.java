package operacoes;
import java.util.Scanner;

import classesConceituais.*;


public class OperacoesR      {
    final static Scanner LER = new Scanner(System.in);

    static void setRockProperties(Rock rock) {
        System.out.println("Enter rock name:");
        rock.setName(LER.next());

        System.out.println("Enter rock type:");
        rock.setType(LER.next());

        System.out.println("Enter hardness (float):");
        float nsei=LER.nextFloat();
        Dureza h = new Dureza(nsei);
        rock.setDureza(h);
       
        System.out.println("Enter site information:");
        rock.setSite(OperacoesS.InsertInfoS());
        
        System.out.println("Is it a gem? (true/false):");
        rock.setGem(LER.nextBoolean());
    }

}