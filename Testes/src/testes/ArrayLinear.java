/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.lang.reflect.Array;
import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class ArrayLinear {
    private final int[] dados;
    private static final Random gerador = new Random();
    
    public ArrayLinear(int tamanho){
        
        dados = new int [tamanho];
        
        for (int i = 0; i < tamanho; i++){
            dados[i] = 10 + gerador.nextInt(90);
        }
    }
    
    public int pesquisaLinear(int chaveDePesquisa){
        for(int i = 0; i < dados.length; i++){
            if(dados[i] == chaveDePesquisa)
                return i;
        }
        
        return - 1;
    }
    
    public void mostrar(){
        for(int i = 0; i < dados.length; i++){
            System.out.print(dados[i]+" ");
            if(i % 10 == 0){System.out.println();}
        }
    }
}
