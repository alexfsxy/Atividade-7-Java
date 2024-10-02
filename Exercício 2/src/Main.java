import navegation.OpcaoHistorico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Histórico de Navegação");
        Scanner scanner = new Scanner(System.in);
        OpcaoHistorico opcaoHistorico;
        opcaoHistorico = new OpcaoHistorico(scanner);
        opcaoHistorico.showMenu();
    }
}
