package duplo_controle_reversao;

public class DoublyUndoManagerAnalysis {
    private DoublyActionNode head;
    private DoublyActionNode current;
    private DoublyActionNode undoHead;
    private DoublyActionNode undoCurrent;

    public DoublyUndoManagerAnalysis() {
        this.head = null;
        this.current = null;
        this.undoHead = null;
        this.undoCurrent = null;
    }

    public void performAction(String action) {
        DoublyActionNode newNode = new DoublyActionNode(action);
        if (head == null) {
            head = newNode;
        } else {
            current.setNext(newNode);
            newNode.setPrev(current);
        }
        current = newNode;

        undoHead = null;
        undoCurrent = null;
    }

    public void undo() {
        if (current != null) {
            System.out.println("Desfeito: " + current.getAction());

            DoublyActionNode undoneNode = current;
            current = current.getPrev();

            if (undoHead == null) {
                undoHead = undoneNode;
            } else {
                undoCurrent.setNext(undoneNode);
                undoneNode.setPrev(undoCurrent);
            }
            undoCurrent = undoneNode;

            if (current != null) {
                current.setNext(null);
            } else {
                head = null;
            }

            undoneNode.setPrev(null);
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void redo() {
        if (undoCurrent != null) {
            System.out.println("Refeito: " + undoCurrent.getAction());

            DoublyActionNode redoneNode = undoCurrent;
            undoCurrent = undoCurrent.getPrev();

            if (current == null) {
                head = redoneNode;
            } else {
                current.setNext(redoneNode);
                redoneNode.setPrev(current);
            }
            current = redoneNode;

            if (undoCurrent != null) {
                undoCurrent.setNext(null);
            } else {
                undoHead = null;
            }

            redoneNode.setNext(null);
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    public void displayActions() {
        System.out.println("Ações realizadas:");
        DoublyActionNode actionnode = head;
        while (actionnode != null) {
            System.out.println(actionnode.getAction());
            actionnode = actionnode.getNext();
        }
    }

    public void displayUndoneActions() {
        System.out.println("Ações desfeitas:");
        DoublyActionNode node = undoHead;
        while (node != null) {
            System.out.println(node.getAction());
            node = node.getNext();
        }
    }
}
