package jogodecartas;

import java.util.Scanner;

public class GameCardsOption {
    private DeckOfCards deckOfCards;
    private final Scanner scanner;


    public GameCardsOption(Scanner scanner) {
        this.deckOfCards = new DeckOfCards();
        this.scanner = scanner;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Adicionar a  Carta");
            System.out.println("2. Remover a Carta");
            System.out.println("3. Mover a Carta");
            System.out.println("4. Mostrar a Mão");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCard();
                    break;
                case 2:
                    removeCard();
                    break;
                case 3:
                    moveCard();
                    break;
                case 4:
                    deckOfCards.displayHand();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }

    private void addCard() {
        System.out.println("Digite o naipe da carta (Ex: Coracoes, Espadas, Diamantes, Clubes):");
        String suit = scanner.nextLine();
        System.out.println("Digite o valor da carta (Ex: As, 2, 3, 4, 5, 6, 7, 8, 9, 10, Valete, Rainha, Rei):");
        String rank = scanner.nextLine();
        deckOfCards.addCard(new Cards(suit, rank));
        System.out.println("Carta adicionada: " + rank + " of " + suit);
    }

    private void removeCard() {
        System.out.println("Digite o valor da carta a ser removida:");
        String rank = scanner.nextLine();
        System.out.println("Digite o naipe da carta a ser removida:");
        String suit = scanner.nextLine();
        boolean removed = deckOfCards.removeCard(rank, suit);
        if (removed) {
            System.out.println("Carta foi removida: " + rank + " of " + suit);
        } else {
            System.out.println("Carta não foi encontrada na mão.");
        }
    }

    private void moveCard() {
        System.out.println("Digite a posição atual da carta:");
        int oldPosition = scanner.nextInt();
        System.out.println("Digite a nova posição da carta:");
        int newPosition = scanner.nextInt();
        scanner.nextLine();
        boolean moved = deckOfCards.moveCard(oldPosition, newPosition);
        if (moved) {
            System.out.println("Carta movida da posição " + oldPosition + " para a posição " + newPosition);
        } else {
            System.out.println("Movimento inválido.");
        }
    }
}
