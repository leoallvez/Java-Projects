package embaralhacartas;

public class TestCarta {
    public static void main (String[] args){
        DeckDeCartas myDeckOfCards = new DeckDeCartas();
        
        myDeckOfCards.shuffle();
        
        myDeckOfCards.mostra();
    }
}
