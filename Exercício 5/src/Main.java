import jogodecartas.GameCardsOption;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("Jogo de Cartas");
        Scanner scanner = new Scanner(System.in);
        GameCardsOption cardGameMenu;
      cardGameMenu  = new GameCardsOption(scanner);

        cardGameMenu.showMenu();
    }
}
