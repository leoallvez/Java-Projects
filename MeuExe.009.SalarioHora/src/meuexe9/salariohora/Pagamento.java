package meuexe9.salariohora;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 18.02.2015
 */
public class Pagamento {
    public int getHorasExtras(int ht){
        return ht - 40;
    }
    
    public double getPagamento(double sh ,int ht){
        if(ht <= 40){
            return sh * ht;
        }else{
            int x = getHorasExtras(ht); // Achando o número de horas.
            
            return (sh* ht) + ((sh * x) / 2);
        }
    }   
}
