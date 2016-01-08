package ioo.ex.pkg001;
import javax.swing.JOptionPane;

/**
 * Implementação orientada a objetos
 * @author Leonardo Pereira Alves.
 * @version 10.03.15
 */
public class Programa {

    public static void main(String[] args) {
        Banco cliente1 = new Banco();
        try{
            String s = JOptionPane.showInputDialog(null,"Digite o Saldo Medio: ");
            if(s == null){ 
                System.exit(0);
            }else{
                double n = Double.parseDouble(s);
                n = cliente1.Credito(n);
                JOptionPane.showMessageDialog(null,"Seu credito é: "+n,"Credito: ",2);
            }
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Digite apenas números","ERRO",0);
           System.exit(0);
        }
    }
    
}
