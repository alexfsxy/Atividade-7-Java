package controle_reversão;
import java.util.Scanner;

public class UndoManagerOption {
    private final UndoManagerAnalysis undoManager;
    private final Scanner scanner;

    public UndoManagerOption(Scanner scanner) {
        this.undoManager = new UndoManagerAnalysis();
        this.scanner = scanner;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Realizar Ação");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Actions");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter action description:");
                    String description = scanner.nextLine();
                    undoManager.performAction(description);
                    break;
                case 2:
                    undoManager.undo();
                    System.out.println("Ultima ação desfeita.");
                    break;
                case 3:
                    undoManager.redo();
                    break;
                case 4:
                    undoManager.displayActions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
