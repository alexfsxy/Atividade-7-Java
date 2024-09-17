package navegation;

public class HistoricoNavegacao {
    private Navegacao head;

    public HistoricoNavegacao() {
        this.head = null;
    }

    
    public void addNavegacao(String description) {
        Navegacao newNavegacao = new Navegacao(description);
        if (head == null) {
            head = newNavegacao;
        } else {
            Navegacao current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNavegacao);
        }
    }

    
    public void removeNavegacao(int id) {
        if (head == null) return;

        if (head.getId() == id) {
            head = head.getNext();
            return;
        }

        Navegacao current = head;
        while (current.getNext() != null && current.getNext().getId() != id) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    
    public void markNavegacaoCompleted(int id) {
        Navegacao current = head;
        while (current != null) {
            if (current.getId() == id) {
                current.setCompleted(true);
                return;
            }
            current = current.getNext();
        }
    }

    
    public void displayNavegacao() {
        Navegacao current = head;
        while (current != null) {
            String status = current.isCompleted() ? "Completo" : "Pendente";
            System.out.println("ID: " + current.getId() + " - Navegacão: " + current.getDescription() + " - Status: " + status);
            current = current.getNext();
        }
    }
}
