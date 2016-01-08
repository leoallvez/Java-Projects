package embaralhacartas;


/**
 * @author Leonardo Pereira Alves.
 * @version 18/07/2015
 */
public class Carta {
    private final String face;
    private final String naipe;
    
    public Carta(String face, String naipe){
        this.face = face;
        this.naipe = naipe;
    }
    
    @Override
    public String toString(){
        return face + " of " + naipe;
    }
}
