package meuexe.pkg0017;
import javax.swing.*;

/**
 *
 * @author Leonardo Pereira Alves.
 * @version 08.03.15
 * Fazer esse programa usando a orientação da objeto da forma mais profissional prossivel.
 */
public class Programa {
    static int x; // Variavel que define a quantidade de alunos.
    static String[] info; // Array info para guardar os nomes do alunos.
    
    public static String[] recebeDados(){
        String a = JOptionPane.showInputDialog(null,"Informe quantos nomes que escrever\nou 0 para sair:");
        if ( a == null){System.exit(0);} // Se for selecionado cancelar finaliza programa
        
        try{
            x = Integer.parseInt(a);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números inteiros !","ERRO!",0);
            recebeDados(); // Em caso de erro o metodo reinicia.
        }
        
        info = new String[x]; // Criando a quantidade de array definidos pelo usuario
        
        if (x != 0){
            for(int cont = 0; cont < x; cont++){
                info[cont] = JOptionPane.showInputDialog(null,"Digite um nome: ");
                if(info[cont] == null){System.exit(0);}
            }
        }else{
            System.exit(0);
        }
        return info;
    }
    public static void main(String[] args) {
        String[] resp = new String[x]; // Criação de outro array 
        resp = recebeDados();
        String st = "";
        int z = info.length;
        for(int y = 0; y < z; y++){
            st += "\n"+resp[y];
        }
        JOptionPane.showMessageDialog(null,st,"Resultados",-1);
    }
}
