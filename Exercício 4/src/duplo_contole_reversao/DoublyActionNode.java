package duplo_controle_reversao;

public class DoublyActionNode {
    private Object next;
    private String doublyaction;
    private DoublyActionNode prev;

    public DoublyActionNode(String action) {
        this.doublyaction = action;
        this.next = null;
        this.prev = null;
    }

    public String getAction() {
        return doublyaction;
    }

    public DoublyActionNode getNext() {
        return (DoublyActionNode) next;
    }

            public void setNext(DoublyActionNode next) {
    this.next = next;
    }

    public DoublyActionNode getPrev() {
        return  prev;
    }

    public void setPrev(DoublyActionNode prev) {
   DoublyActionNode prev1 = this.prev = prev;
    }

}

