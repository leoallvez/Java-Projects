package i00.ex.pkg003.pkgfor;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class I00EX003For {

    public static void main(String[] args) {
        try{
            String s = JOptionPane.showInputDialog(null,"Digite um valor de n: ");
            if (s == null){System.exit(0);}
            int n = Integer.parseInt(s);
            double a = 0;
            
            for(int i = 1 ; i <= n; i++){
                a = a + (n-i)/(i+1.); 
            }
            
            a = a + n + 1./n; // Soma da pontas  
            
            JOptionPane.showMessageDialog(null,"Valor de A: " +a,"Resultado",-1);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números","ERRO",0);
            System.exit(0);
        }   
    }
}
