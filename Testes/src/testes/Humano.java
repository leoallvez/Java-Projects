/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Leonardo
 */
public class Humano extends Animal implements Mamifero{
    @Override
    public void fazSom() {
        System.out.println("Olá, muito prazer");
    }
    
    @Override
    public void mama(){
        System.out.println("Humano mamando");
    }
}
