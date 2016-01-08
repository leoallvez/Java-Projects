package av_ex011_cadastro;
/**
 * Ambientes Visuais
 * @author Leonardo Pereira Alves
 * @version 27/04/2015
 */
public class Pessoa {
    
    private String cpf;
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String c){
        cpf = c;
    }
}
