package meuexe.pkg013;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 07.03.15
 */
public class Programa {

    public static void main(String[] args) {
        char es;
        // cria a "String" desta forma facilita a formatação da mensagem.
        String st = "Escolha o paneta: "+
        "\nMercurio (a)"+
        "\nVênus    (b)"+
        "\nTerra    (c)"+
        "\nMarte    (d)"+
        "\nJúpiter  (e)"+
        "\nSaturno  (f)"+
        "\nUrano    (g)"+
        "\nNetuno   (h)"+
        "\nPlutão   (i)";
        /* Em vez de escrever a mensagem 
           dentro da caixa InputDialog
           ela foi escrita em separado.
        */
        String a = JOptionPane.showInputDialog(null,st);
        es = a.charAt(0); // Captura apenas a primeira letra digitada.
        
        switch(es){
            case 'a' : st = Planeta.mercurio; break;
            case 'b' : st = Planeta.venus; break;
            case 'c' : st = Planeta.terra; break;
            case 'd' : st = Planeta.marte; break;
            case 'e' : st = Planeta.jupiter; break;   
            case 'f' : st = Planeta.saturno; break;
            case 'g' : st = Planeta.urano; break;
            case 'h' : st = Planeta.netuno; break;
            case 'i' : st = Planeta.plutao; break;
            default : st = "Planeta inexistente";
        }
        // Esta "String" é criada fora do painel de mensagem
        
        String ms = "Dados Astronomicos dos Planetas";
        
        // Duas "Strings" são chamadas dentro de MessageDialog
        
        JOptionPane.showMessageDialog(null,st,ms,-1);
        
        System.exit(0); // Provoca a saida do sistema.
    } 
}
