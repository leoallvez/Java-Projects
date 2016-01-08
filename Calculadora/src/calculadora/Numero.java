/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Leonardo
 */
public class Numero {
     private double numD;
     private int numI;
     
    public Numero(double numero) {
        this.numD = numero;
    }
    
    public Numero(int numero){
        this.numI = numero;
    }
    
    public Numero(){}
    
    public double getDouble(){
        return numD;
    }
    
    public int getInteger(){
        return numI;
    }
}
