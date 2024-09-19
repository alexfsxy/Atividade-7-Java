package jogodecartas;


public record Cards(String suit, String rank) {



    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
