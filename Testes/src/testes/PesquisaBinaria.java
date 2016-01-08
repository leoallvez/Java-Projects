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
public class PesquisaBinaria {
    private final int[] dados;
    private static final Random gerador = new Random();
    
    public PesquisaBinaria(int tamanho){
        
        dados = new int[tamanho];
        
        for(int i = 0; i < tamanho; i++){
            dados[i] = 10 + gerador.nextInt(90);
        }
    
        Arrays.sort(dados);
    }
    
    public int buscaBinaria(int elem){
        int inicio = 0; //extremidade baixa da área de pesquisa
        int fim = dados.length - 1; // extremidade alta da área de pesquisa
        int meio = (inicio + fim + 1) / 2; // elemento do meio
        int localizacao = -1; // valor de retorno se não localizado
        
        do{
            //imprime elementos remanecentes do array
            System.out.print(elementosRemanecentes(inicio,fim));
            //gera espaço para aliamento
            for(int i = 0; i < meio; i++)
                System.out.print(" ");
            System.out.println(" * ");
        
            //se o elemento for localizado no meio.
            if(elem == dados[meio])
                localizacao = meio;
            //se o elemento do meio é muito alto.
            else if (elem < dados[meio])
                fim = meio - 1;
            else //se o lemnto do meio é muito baixo.
                inicio = meio + 1; //elemina a metade mais alta.
        
            meio = (inicio + fim + 1) / 2; // recalcula meio.
        }while((inicio <= fim) && (localizacao == -1)); 
        
        return localizacao;
    }
    
    //método que para gerar saida  de certos valores no array.
    public String elementosRemanecentes(int baixo, int alto){
        StringBuilder temporario = new StringBuilder();
        
        //gerar espaco de aliamento.
        for(int i = 0; i < baixo; i++)
            temporario.append(" ");
        
        for(int i = baixo; i <= alto; i++)
            temporario.append(dados[i]).append(" ");
        
        
        temporario.append("\n");
        
        return temporario.toString();
    }
    
    public void mostrar(){
        for(int i = 0; i < dados.length; i++){
            System.out.print(dados[i]+" ");
            if(i % 10 == 0){System.out.println();}
        }
    }
    
}
