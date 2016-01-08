/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex13_cadastrolivro;

import javax.swing.JFrame;

/**
 * Programa de cadastro de livro.
 * @author Leonardo Pereira Alves.
 * @version 11/05/2015
 */
public class Principal {

    public static void main(String[] args) {
        InterLivro cadLivro = new InterLivro();
        cadLivro.setVisible(true);
        cadLivro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadLivro.setBounds(100,100,400,250);
        
    }
    
}
