public class Tile {

    private final String face;
    private final String suit;
    public Tile(String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;

    }
    public String toString() {
        return face + "/" + suit + "  ";
    }
}
