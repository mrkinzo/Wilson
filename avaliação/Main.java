
import java.util.Scanner;

public class Main {
    final static Scanner LER = new Scanner(System.in);
    
    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }
    public static void main(String[] args) {
        int control = 9;

        while (control != 0) {
            System.out.println("insira a operação");
            System.out.println("1 para adicionar Rochas ao DB");
            System.out.println("2 para Remover Rochas do DB");
            System.out.println("3 para Editar Rochas do DB");
            System.out.println("4 para Imprimir Rochas");
            System.out.println("5 para adicionar Minerais ao DB");
            System.out.println("6 para Remover Minerais do DB");
            System.out.println("7 para Editar Minerais do DB");
            System.out.println("8 para Imprimir Minerais");
            System.out.println("0 para sair");
            control = LER.nextInt();
            switch (control) {
                case 1:
                    Rock rock = new Rock();
                    OperacoesR.setRockProperties(rock);
                    RocksDb.addToLog(rock);
                    break;
                case 2:
                    RocksDb.removeFromLog();
                    break;
                case 3:
                    RocksDb.editFromLog();
                    break;
                case 4:
                    RocksDb.PrintDB();
                    break;
                case 5:

                    Mineral mineral = new Mineral();
                    OperacoesM.setMineralProperties(mineral);
                    MineralDB.addToLog(mineral);
                    break;
                case 6:
                    MineralDB.removeFromLog();
                    break;
                case 7:
                    MineralDB.editFromLog();
                    break;
                case 8:
                    MineralDB.PrintDB();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opção invalida");
                    break;


            }
            limparTela();
        }

    }

}
