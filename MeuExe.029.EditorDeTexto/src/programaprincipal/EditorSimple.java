package programaprincipal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Editor de texto simples.
 * @author Leonardo Pereira Alves.
 * @version 03.04.2015
 */
public class EditorSimple extends JFrame {
    /** Componente que é realmente manipulado é referenciado por uma variavel
     *  para que todos os metodos possam usa-los.
     */
    private final JTextArea editor;
  
   
    
    public EditorSimple(){
        super("Editor");
        /**O painel que contem os botoes usa um GridLayout de 1 coluna e 5 
         * linhas para posicionar os botoes.
         */
        final GridLayout leiauteDeGrade = new GridLayout();
        leiauteDeGrade.setColumns(1);
        leiauteDeGrade.setHgap(10);
        editor = new JTextArea(1000,1000);
        editor.setEditable(true);
        
        leiauteDeGrade.setHgap(10);
        leiauteDeGrade.setRows(5); //Define um pequeno espaço entre os botoes.
        leiauteDeGrade.setVgap(3); // Melhora a aparencia
        
        final JPanel painelDeBotoes = new JPanel(leiauteDeGrade);
        painelDeBotoes.setBorder(BorderFactory.createEtchedBorder());
        /**
         * Agora criar botoes, fornecendo um ouvinte que respondera a um clique
         * em cada um deles. Os métodos do ouvinte vão posteriomente delegar 
         * a ação para os metodos auxiliares privados da classe, para evitar que
         * que o construtor se torne muito longo e dificil de ser entendido e
         * modificado,
         */
        
        
        JButton botao = new JButton("Carregar");
        botao.addActionListener(new ActionListener(){ 
            public void actionPerformed(final ActionEvent ae){loadFile();}
        });
        painelDeBotoes.add(botao);
        
        botao = new JButton("Salvar");
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){saveFile();}
        });
        painelDeBotoes.add(botao);
        
        botao = new JButton("Remover");
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){cut();}
        });
        painelDeBotoes.add(botao);
        
        botao = new JButton("Copiar");
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){copy();}
        });
        painelDeBotoes.add(botao);
        
        botao = new JButton("Colar");
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){paste();}
        });
        painelDeBotoes.add(botao);
        /** Agora insere uma barra de rolagem para a area de texto, em seu 
         * proprio painel.
         */
        editor.setLineWrap(true);
 
        JScrollPane paginador = new JScrollPane(editor);
        //paginador.add(editor);
        final JPanel painelDoEditor = new JPanel(new BorderLayout());
        painelDoEditor.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        painelDoEditor.add(paginador,BorderLayout.CENTER);
        // Agora reune os componentes em uma unica entidade.
        final JPanel painelSuperior = new JPanel(new BorderLayout());
        painelSuperior.add(painelDeBotoes, BorderLayout.WEST);
        painelSuperior.add(painelDoEditor,BorderLayout.CENTER);
        // ...e adicionar ao objeto corrente, de Frame.
        add(painelSuperior,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);    
    }// Fim do construtor
    
    private void loadFile(){
        final JFileChooser fc = new JFileChooser();
        final int valorDeRetorno = fc.showOpenDialog(this);
        if(valorDeRetorno == JFileChooser.APPROVE_OPTION){
            final File arquivo = fc.getSelectedFile();
            try{editor.read(new FileReader(arquivo),null);}
            catch(IOException ioe){
                JOptionPane.showMessageDialog(this,"Não é possivel abrir ou ler o aquivo "+arquivo.getName()+".");
            }
        }
    }
    
    private void saveFile(){
        final JFileChooser fc = new JFileChooser();
        final int valorDeRetorno = fc.showSaveDialog(this);
        if(valorDeRetorno == JFileChooser.APPROVE_OPTION){
            final File arquivo = fc.getSelectedFile();
            try{editor.write(new FileWriter(arquivo));}
            catch(IOException ioe){
                JOptionPane.showMessageDialog(this,"Não é possivel abrir ou gravar o arquivo "+arquivo.getName()+".");
            }
        }
    }
    
    private void copy(){editor.copy(); editor.requestFocus();}
    private void paste(){editor.copy(); editor.requestFocus();}
    private void cut(){editor.copy(); editor.requestFocus();}
}
