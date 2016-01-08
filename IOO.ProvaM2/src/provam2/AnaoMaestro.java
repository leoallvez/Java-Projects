package provam2;


public class AnaoMaestro extends Anao{
    
    protected int anosDeRegencia;

    public AnaoMaestro(String nome, double altura,int anos) {
        super(nome,altura);
        anosDeRegencia = anos;
    }  
}
