package meuexe.pkg023.gui.pkg3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 22.03.15
 */
public class TextFieldFrame extends JFrame {
    
    private JTextField textField1; //campo de texto com tamanho configurado;
    private JTextField textField2; //campo de texto construido com texto.
    private JTextField textField3; //campo de texto com texto e tamanho.
    private JPasswordField passwordField; //campo de senha com texto.
    
    // Contrutor TextFieldFrame adiciona JTextFields a JFrame.
    public TextFieldFrame(){
        super("Teste JTextField e PasswordFild");
        setLayout(new FlowLayout()); // configura layout de frame.
        
        //constroi textfield com 10 colunas.
        textField1 = new JTextField(10);
        add(textField1); // adiciona textField1 ao JFrame.
        
        //controi campo de texto com texto padão.
        textField2 = new JTextField("Coloque o texto aqui");
        add(textField2); // adiciona textField2 ao JFrame.
        
        //constroi textfield com texto padrão e 21 colunas.
        textField3 = new JTextField("Digite aqui", 21);
        textField3.setEditable(false);
        add(textField3);
        
        //constrói passwordfield com texto padrão.
        passwordField = new JPasswordField("Digite a senha");
        add(passwordField); // Adiciona passwordField ao JFrame.
        
        //handlers de eveto registradores
        TextFieldHandler hardler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addAncestorListener(handler);
    }//Fim do construtor.
    
    
}
