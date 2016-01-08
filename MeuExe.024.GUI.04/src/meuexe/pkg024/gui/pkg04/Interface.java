/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg024.gui.pkg04;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo
 */
public class Interface extends JFrame {
    
    private final JLabel rotulo;
    private final JTextField campoDeTexto;
    
    public Interface(){
        super("Teste");
        setLayout(new FlowLayout());
        
        //construtor JLabel com um argumento de String
        rotulo = new JLabel("Nome: ");
        add(rotulo);
        
        //construtor de JTextField
        campoDeTexto = new JTextField("Digite aqui",20);
        add(campoDeTexto);   
    }// Fim do construtor
}
