package controle_reversão;

public class ActionNodeUndo {
    private String action;
    private ActionNodeUndo next;

    public ActionNodeUndo(String action) {
        this.action = action;
        this.next = null;
    }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    public ActionNodeUndo getNext() { return next; }
    public void setNext(ActionNodeUndo next) { this.next = next; }
}
