package empresas;

/**
 *
 * @author Leonardo
 */
public class Restaurante extends Empresa{
    protected String tipoDeComida;
    protected double precoMedio;
    
    public Restaurante(){}
    
    public Restaurante(String n,String c,String e,String t, double pm) {
        super(n,c,e);
        this.tipoDeComida = t;
        this.precoMedio = pm;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Tipo de comida:...........: "+tipoDeComida);
        System.out.println("Preço Médio...............: "+precoMedio);
        
    } 
    
    public int buscaCidade (Restaurante vetor[], String cidade){
        int cont = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].cidade.equals(cidade)){
                cont = cont +1;
            }
        }
        return cont;
    }
}
