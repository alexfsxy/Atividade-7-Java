package jogodecartas;

public class DeckOfCards {
    private GameCards head;
    private GameCards tail;
    private int size;

    public DeckOfCards() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Adiciona uma carta à mão (no final da lista)
    public void addCard(Cards card) {
        GameCards newNode = new GameCards(card);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
    }

    // Remove uma carta específica da mão
    public boolean removeCard(String rank, String suit) {
        GameCards node = head;
        while (node != null) {
            if (node.getCard().rank().equals(rank) && node.getCard().suit().equals(suit)) {
                if (node == head) {
                    head = node.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                } else if (node == tail) {
                    tail = node.getPrev();
                    if (tail != null) {
                        tail.setNext(null);
                    }
                } else {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                }
                size--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    // Reorganiza as cartas, movendo uma carta para uma nova posição
    public boolean moveCard(int oldPosition, int newPosition) {
        if (oldPosition < 1 || oldPosition > size || newPosition < 1 || newPosition > size) {
            return false;
        }

        GameCards node = getNodeAtPosition(oldPosition);
        if (node == null) {
            return false;
        }

        // Remove o nó da posição antiga
        if (node == head) {
            head = node.getNext();
            if (head != null) {
                head.setPrev(null);
            }
        } else if (node == tail) {
            tail = node.getPrev();
            if (tail != null) {
                tail.setNext(null);
            }
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }

        // Reinsere o nó na nova posição
        if (newPosition == 1) {
            node.setNext(head);
            if (head != null) {
                head.setPrev(node);
            }
            head = node;
            head.setPrev(null);
        } else if (newPosition == size) {
            node.setPrev(tail);
            if (tail != null) {
                tail.setNext(node);
            }
            tail = node;
            tail.setNext(null);
        } else {
            GameCards prevNode = getNodeAtPosition(newPosition - 1);
            assert prevNode != null;
            GameCards nextNode = prevNode.getNext();
            prevNode.setNext(node);
            node.setPrev(prevNode);
            node.setNext(nextNode);
            if (nextNode != null) {
                nextNode.setPrev(node);
            }
        }
        return true;
    }

    // Obtém o nó na posição especificada
    private GameCards getNodeAtPosition(int position) {
        GameCards node = head;
        for (int i = 1; i < position; i++) {
            if (node == null) {
                return null;
            }
            node = node.getNext();
        }
        return node;
    }

    // Exibe as cartas na mão
    public void displayHand() {
        GameCards node = head;
        while (node != null) {
            System.out.println(node.getCard());
            node = node.getNext();
        }
    }



    public String game() {
        return null;
    }
}
