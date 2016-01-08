package encapsular;
/**
 * Esse programa mostra como funciona o encapsulamento de atributos.
 * @author Leonardo Pereira Alves.
 * @version 18/01/2015
 */
class Teste{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
public class Encapsular {
    public static void main(String[] args) {
        Teste x = new Teste();
        x.setNome("Lucas de Almeida Alves ");
        
        System.out.println("Nome X: " + x.getNome());
        
        Teste z = new Teste();
        
        z.setNome(x.getNome());
        
        System.out.println("Nome Z: " + z.getNome());
    }
}
