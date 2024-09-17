package duplo_controle_reversao;
import java.util.Scanner;

public class DoublyUndoManagerOption {
    private final DoublyUndoManagerAnalysis doublyUndoManager;
    private final Scanner scanner;

    public DoublyUndoManagerOption(Scanner scanner) {
        this.doublyUndoManager = new DoublyUndoManagerAnalysis();
        this.scanner = scanner;
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Realizar Ação");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Actions");
            System.out.println("5. Display Undone Actions");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter action description:");
                    String description = scanner.nextLine();
                    doublyUndoManager.performAction(description);
                    break;
                case 2:
                    doublyUndoManager.undo();
                    System.out.println("Ultima ação desfeita.");
                    break;
                case 3:
                    doublyUndoManager.redo();
                    break;
                case 4:
                    doublyUndoManager.displayActions();
                    break;
                case 5:
                    doublyUndoManager.displayUndoneActions();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
