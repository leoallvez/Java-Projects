package ioo.ex.pkg001;

import javax.swing.JOptionPane;

/**
 * Implementação Orientada a Objetos.
 * @author Leonardo Pereira
 * 
 */
public class IOOEX001 {

    public static void main(String[] args) {
        
        try{ // Tratamento de erro
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de um mês: "));
            String result;
            
            switch (mes){
                case 1: case 2: case 3: result = "faz parte do Verão"; break;
                case 4: case 5: case 6: result = "faz parte do Outono"; break;
                case 7: case 8: case 9: result = "faz parte do Inverno"; break;            
                case 10: case 11: case 12: result = "faz parte da Primavera"; break;
                default : result = "é um mês invalido";
            }
            JOptionPane.showMessageDialog(null," O mês "+mes+" "+result,"Resultado",-1);
        } 
        
        catch(NumberFormatException x){
            JOptionPane.showMessageDialog(null,"Digite apenas números !","ERRO !", 0);
        }
    }
}
