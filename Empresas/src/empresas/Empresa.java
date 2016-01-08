package empresas;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class Empresa{
    protected String nome;
    protected String cidade;
    protected String estado;
    
    Empresa(){}
    
    public Empresa(String n,String c, String e){
        nome = n;
        cidade = c;
        estado = e;
    }
    
    public void mostrar(){
        System.out.println("Dados Empresa");
        System.out.println("Nome...........: "+nome);
        System.out.println("Cidade.........: "+cidade);
        System.out.println("Estado.........: "+estado);
    } 
}
