/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg016.pkgthis;

/**
 *
 * @author Leonardo
 */
public class Nome {
    String nome = "Paulo";
    String resp = " ";
    
    public void setNome(String nome){
        this.nome = nome;
        resp += nome;
    }
    
    public void mostrarNome(){
        resp += "\n"+nome;
    }
    
}
