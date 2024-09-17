package navegation;

public class Navegacao {
    private static int idCounter = 0;
    private final int id;
    private final String description;
    private boolean completed;
    private Navegacao next;

    public Navegacao(String description) {
        this.id = idCounter++;
        this.description = description;
        this.completed = false;
        this.next = null;
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
    // public void setDescription(String description) { this.description = description; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public Navegacao getNext() { return next; }
    public void setNext(Navegacao next) { this.next = next; }
}
