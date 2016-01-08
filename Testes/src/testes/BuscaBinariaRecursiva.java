/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class BuscaBinariaRecursiva {
    
    public int busca(int[] dados,int inicio,int fim, int chave){
        
        int meio = (inicio + fim ) / 2;
        
        if(chave == dados[meio])
            return meio;
        else if (chave < dados[meio])
            return busca(dados,inicio,meio-1,chave);
        else if (chave > dados[meio])
            return busca(dados,meio+1,fim,chave);
        else
            return -1;
    }
}
