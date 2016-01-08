package ioo.ex.pkg004.enquantofaca;
import javax.swing.JOptionPane;

/**
 * Implentação Orientada a Objeto.
 * @author Leonardo Pereira Alves.
 * @version 11.03.15
 */
public class Programa {

    public static void main(String[] args) {
        try{
            int i = 0;
            double media;
            int n;
            int soma = 0;
            do{
                String s = JOptionPane.showInputDialog(null,"Entre com um valor: ");
                if(s == null){System.exit(0);}
                n = Integer.parseInt(s);
                if (n != 9999){
                    soma = soma + n;
                    i++;
                }
            }while (n != 9999);
        
            media = soma / i;
        
            JOptionPane.showMessageDialog(null,"Soma: "+soma+" Média: "+media,"Resultado",1);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números inteiro","ERRO",2);
            System.exit(0);
        }
    }
}
