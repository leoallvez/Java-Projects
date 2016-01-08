package complexidadedealgoritmo;

import java.util.Random;

/**
 * Estudo do algoritmo de insercao direta
 * @author Leonardo Pereira Alves
 * @version 16/08/2015
 */
public class Ordenacao {
    private int[] dados;
    
    public Ordenacao(int[] dados){
        this.dados = dados;
    }
    
    public Ordenacao(int n){
        Random aleatorio = new Random();
        dados = new int[n];
        for(int i = 0; i < dados.length; i++){
            dados[i] = aleatorio.nextInt(10);
        }
    }
    public void insercaoDireta(){
        for(int  i = 1; i < dados.length; i++){
            
            int j = 0;
            boolean achou = false;
            
            while((j < i) && (!achou)){
                if(dados[i] < dados[j]){
                    achou = true;
                }else{
                    j = j + 1;
                }
            }
            
            if (achou == true){
                
                int trab = dados[i];
                int k = i - 1;
                while(k >= j){
                    dados[k+1] = dados[k];
                    k = k - 1;
                }
                dados[j] = trab;
            }
        }//Fim do for.
    }//Fim do metodo Inserção direta.
    
    public void bubbleSort(){
        int aux;
        for(int x = 0; x <= 9; x++)
            for(int y = 0; y <= 8; y++)
                if(dados[y] > dados[y+1]){
                    aux = dados[y];
                    dados[y] = dados[y+1];
                    dados[y+1] = aux;
                }
    }
    
    public void bubbleSort2(){
        boolean fazTroca = true;
        int aux;
        while(fazTroca == true){
            fazTroca = false;
            for(int i = 0; i < dados.length - 1; i++){
                if(dados[i] > dados[i+1]){
                    aux = dados[i];
                    dados[i] = dados[i+1];
                    dados[i+1] = aux;
                
                    fazTroca = true;
                }  
            }
        }
    }
    
    public boolean buscaBinaria(int busca){
        boolean achou = false;
        int inicio = 0;
        int fim = dados.length - 1;
        int meio = (inicio + fim) / 2;
        while((busca != dados[meio]) && (inicio != fim)){
            if(busca > dados[meio]){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
            meio = (inicio + fim) / 2;
        }
        return (busca == dados[meio]);
    }
    
    public void mostrar(){
        for(int i = 0; i < dados.length; i++){
            System.out.print(dados[i]+" ");
        }
        System.out.println();
    }
    
}
