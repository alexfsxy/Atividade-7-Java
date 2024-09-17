package controle_reversão;

public class UndoManagerAnalysis {
    private ActionNodeUndo head;
    private ActionNodeUndo undoStack;

    public UndoManagerAnalysis() {
        this.head = null;
        this.undoStack = null;
    }

    public void performAction(String action) {
        ActionNodeUndo newNode = new ActionNodeUndo(action);
        newNode.setNext(head);
        head = newNode;

        undoStack = null;
    }

    public void undo() {
        if (head == null) {
            System.out.println("Nada para desfazer.");
            return;
        }

        ActionNodeUndo undoneAction = head;
        head = head.getNext();
        undoneAction.setNext(undoStack);
        undoStack = undoneAction;

        System.out.println("Desfeito: " + undoneAction.getAction());
    }

    public void redo() {
        if (undoStack == null) {
            System.out.println("Nada para refazer.");
            return;
        }

        ActionNodeUndo redoneAction = undoStack;
        undoStack = undoStack.getNext();
        redoneAction.setNext(head);
        head = redoneAction;

        System.out.println("Refeito: " + redoneAction.getAction());
    }

    public void displayActions() {
        ActionNodeUndo current = head;
        while (current != null) {
            System.out.println(current.getAction());
            current = current.getNext();
        }
    }
}
