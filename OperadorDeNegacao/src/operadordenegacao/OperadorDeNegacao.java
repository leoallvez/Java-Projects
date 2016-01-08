package operadordenegacao;
/**
 *
 * @author Leonardo Pereira Alves
 * @version 28-12-2014
 */
public class OperadorDeNegacao {
    public static void main (String[] args){
        int idade = 15;
        boolean amigoDoDono = true;
        /* Operador de negação "!" transforma 
           true em false e vice e versar. */
        if (idade < 18 & !amigoDoDono){
            System.out.println("Não Pode entrar");
        }else{
            System.out.println("Pode entrar");
        }
    } 
}
    

