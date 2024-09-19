package jogodecartas;


    public class GameCards {
        private final Cards card;
        private GameCards next;
        private GameCards prev;

        public GameCards(Cards card) {
            this.card = card;
            this.next = null;
            this.prev = null;
        }

        public Cards getCard() {
            return card;
        }

        public GameCards getNext() {
            return next;
        }

        public void setNext(GameCards next) {
            this.next = next;
        }

        public GameCards getPrev() {
            return prev;
        }

        public void setPrev(GameCards prev) {
            this.prev = prev;
        }
    }
