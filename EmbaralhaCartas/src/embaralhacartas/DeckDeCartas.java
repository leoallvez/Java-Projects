package embaralhacartas;

import java.util.Random;

/**
 * @author Leonardo Pereira Alves.
 * @version 18/07/2015
 */
public class DeckDeCartas {
    private final Carta[] deck; // Array de cartas.
    private int currentCard;
    private static final int numeroDeCartas = 52;
    private static final Random randomNumbers = new Random();
    
    public DeckDeCartas(){
        String[] faces = {"Ace","Deuse","Three","Four","Five","Six","Seven",
        "Eight","Nine","Ten","Jack","Queen","King"};
        
        String[] naipes = {"Hearts","Diamonds","Clubs","Spades"};
        
        deck = new Carta[numeroDeCartas]; //Cria array de objetos Cartas
        currentCard = 0;
        // preenche baralho com objetos Cartas
        for(int i = 0; i < deck.length; i++){
            deck[i] = new Carta(faces[ i % 13], naipes[ i / 13]);
        }
    }
    
    public void shuffle(){ 
        // depois de embaralhar, a distribuição deve iniciar em deck[0] novamente
        currentCard = 0;
        
        //para cada Carta seleciona outra carta aleatoriamente e as compara
        for(int a = 0; a < deck.length; a++){
            //seleciona um número aleatório entre 0 e 51.
            int b = randomNumbers.nextInt(numeroDeCartas);
            
            Carta auxilia; //Objeto auxiliar.
            //Efetua troca
            auxilia = deck[a];
            deck[a] = deck[b];
            deck[b] = auxilia;
        } 
    }
    
    public Carta dealCard(){
        
        //determina se ainda há Carta a serem distribuidos
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
    
    public void mostra(){
        for(int i = 0; i < deck.length; i++){
            System.out.printf("%-19s",dealCard());
            
            if( i % 4 == 0)
                System.out.println();
        }
    }
}
