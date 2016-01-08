//Pacote da classe.
package av_ex009.cor;
// Importando bibliotecas.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Ambientes visual
 * @author Leonardo Pereira Alves 12141500534
 * @author Camila Sampaio 12141100130;
 * @version 30/03/2015
 */
public class Cores extends JFrame{
    
    private final JMenu menu;
    private final JMenuItem azul, amarelo, verde, vermelho, 
    preto, ciano, cinza, laranja, rosa, sair;
    private final JMenuBar menus;
    private final JLabel ocioso;
    private final JSeparator divisao;
    private JTextArea areaDeTexto;
    
    public Cores(){
        //Definindo o titulo do JFrame.
        super("Cores");
        // Evita que a janela seja maximinizada.
        //setResizable(false); 
        // Centraliza a posição da janela e define o tamanho da janela.
        setBounds(500,100,480,480);
        // Metodo para que quando a janela for fechada o programa finalizar.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Instanciando JTextAre e definindo o seu tamanho.
        areaDeTexto = new JTextArea();
        // Metodo de quebra de linha.
        areaDeTexto.setLineWrap(true);
        // Adicionando barra de rolagem na area de texto.
        JScrollPane barraDeRodagem = new JScrollPane(areaDeTexto);
        // Centralizando JScrollPane no Frame.
        add(barraDeRodagem,BorderLayout.CENTER);
        // Instanciando o JLabel ocioso 
        ocioso = new JLabel("ocioso");
        //Colocando o JLabel ocioso no JFrame no sul do layout.
        add(ocioso, BorderLayout.SOUTH);
        
        // Instanciando os JMenusItem 
        azul = new JMenuItem("Azul");
        amarelo = new JMenuItem("Amarelo");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        preto = new JMenuItem("Preto");
        ciano = new JMenuItem("Ciano");
        cinza = new JMenuItem("Cinza");
        laranja = new JMenuItem("Laranja");
        rosa = new JMenuItem("Rosa");
        divisao = new JSeparator();
        sair = new JMenuItem ("Sair");
        
        // Instanciando o JMenu e adicionar os JMenusItens nele.
        menu = new JMenu("Cor");
        menu.add(azul);
        menu.add(amarelo);
        menu.add(verde);
        menu.add(vermelho);                 
        menu.add(preto);
        menu.add(ciano);
        menu.add(cinza);
        menu.add(laranja);
        menu.add(rosa);
        menu.add(divisao);
        menu.add(sair);
        menus = new JMenuBar();
        menus.add(menu);
        
        //Adicionando o JMenu no JFrame e o colocando no norte do layout.
        add(menus, BorderLayout.NORTH);
        
        // Definindo os eventos dos JMenusItens.
        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.blue);
            }
        });
        
        amarelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.yellow);
            }
        });
        
        verde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.green);
            }
        });
        
        vermelho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.red);
            }
        });
     
        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.blue);             
            }
        });  
        
        preto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.black);             
            }
        });
        
        ciano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.cyan);             
            }
        });
        
        cinza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.gray);             
            }
        });

        laranja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.orange);             
            }
        });
        
        rosa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setForeground(Color.pink);             
            }
        });
        
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });   
    }// Fim do construtor cor
}// Fim da classe cor