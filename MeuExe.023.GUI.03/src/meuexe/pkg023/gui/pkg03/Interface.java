package meuexe.pkg023.gui.pkg03;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Leonardo
 */
public class Interface extends JFrame{
    private final JTextField campoDeTexto;
    
    public Interface(){
        super("Campo de texto");
        
        setLayout(new FlowLayout());// configura o layout de frame.
        
        //Controi campo de texto com texto padrão.
        campoDeTexto = new JTextField("Enter com o texto",20);
        add(campoDeTexto);
        
        //handlers de eventos registradores.
        TextFieldHandler handler = new TextFieldHandler();
        campoDeTexto.addActionListener(handler);
    }// Fim do contrutor.
    
    // Classe interna privada para tratamento de evento.
    private class TextFieldHandler implements ActionListener{
        //processa eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent event){
            String string = ""; // Declara evento a ser exibido
            //usuario pressionou Enter no JTextField campoDeTexto.
            if(event.getSource() == campoDeTexto){
                string = String.format("campoDeTexto: %s",event.getActionCommand());
            }    
            JOptionPane.showMessageDialog(null,string);
        }
    }   
}
