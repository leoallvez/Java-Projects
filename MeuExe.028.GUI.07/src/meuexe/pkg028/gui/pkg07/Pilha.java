/*
 * Essa classe implementa a estrutura de dados pilha.
 */
package meuexe.pkg028.gui.pkg07;

/**
 * Estrutura de Dados
 * @author Leonardo Pereira Alve.
 * @version 11.03.15
 */
public class Pilha {
    
    private int topo;
    final int max;
    
    /** Contrutor da classe que inicializa a constante max que controla o 
     *  limite da pilha;
     */
    
    Pilha(int max){
        this.max = max;
    }
    
    //Esse metodo inicializa a pilha.
    public void Int(){
        this.topo = 1;
    }
    
    //Esse metodo verifica se a pilha esta vazia.
    public boolean isEmpty(){
        return this.topo == 0;
    }
    
    //Esse metodo verifica se a pilha esta cheia.
    public boolean isFull(){
        return this.topo == this.max;
    }
    
    // Esse metodo adiciona uma elemento na pilha.
    public int[] push(int[] pilha,int elem){
        if (this.isFull() == false){
            this.topo++;
            pilha[this.topo] = elem;
        }else{
            System.out.println("Pilha cheia");
        }
        return pilha;
    }
    
    //Sobrecargar do metodo para receber e retornar String.
    public String[] push(String[] pilha, String elem){
        if (this.isFull() == false){
            this.topo++;
            pilha[this.topo] = elem;
        }else{
            System.out.println("Pilha cheia");
        }
        return pilha;
    } 
    
    //Sobrecargar do metodo para receber e retornar char.
    public char[] push(char[] pilha, char elem){
        if (this.isFull() == false){
            this.topo++;
            pilha[this.topo] = elem;
        }else{
            System.out.println("Pilha cheia");
        }
        return pilha;
    }
    
    //Sobrecargar do metodo para receber e retornar double.
    public double[] push(double[] pilha, double elem){
        if (this.isFull() == false){
            this.topo++;
            pilha[this.topo] = elem;
        }else{
            System.out.println("Pilha cheia");
        }
        return pilha;
    }
    
    // Esse metodo retira um elemento de uma pilha de inteiro.
    public int pop(int[] pilha){
        int x = 0;
        if(this.isEmpty() == false){
            x = pilha[this.topo];
            this.topo = this.topo - 1;
        }else{
            System.out.println("Pilha vazia");
        }
        return x;
    }
    
    //Sobrecargar do metodo para receber e retornar String. 
    public String pop(String[] pilha){
        String x = "";
        if(this.isEmpty() == false){
            x = pilha[this.topo];
            this.topo = this.topo - 1;
        }else{
            System.out.println("Pilha vazia");
        }
        return x;
    }  
    
    //Sobrecargar do metodo para receber e retornar String. 
    public char pop(char[] pilha){
        char x = ' ';
        if(this.isEmpty() == false){
            x = pilha[this.topo];
            this.topo = this.topo - 1;
        }else{
            System.out.println("Pilha vazia");
        }
        return x;
    }

    //Sobrecargar do metodo para receber e retornar double.
    public double pop(double[] pilha){
        double x = 0.0;
        if(this.isEmpty() == false){
            x = pilha[this.topo];
            this.topo = this.topo - 1;
        }else{
            System.out.println("Pilha vazia");
        }
        return x;
    }
    
    //Esse metodo apenas retorna o elemento no topo da pilha sem altera-lo.
    public int top(int[] pilha){
        
        if(this.isEmpty() == false){
            return pilha[this.topo];  
        }else{
            System.out.println("Pilha vazia");
            return 0;
        }
    } 
    
    //Sobrecargar do metodo para receber e retornar String.
    public String top(String[] pilha){
        
        if(this.isEmpty() == false){
            return pilha[this.topo];  
        }else{
            System.out.println("Pilha vazia");
            return "";
        }
    }
    
    //Sobrecargar do metodo para receber e retornar char.
    public char top(char[] pilha){
        
        if(this.isEmpty() == false){
            return pilha[this.topo];  
        }else{
            System.out.println("Pilha vazia");
            return ' ';
        }
    }
    
    //Sobrecarga do metodo para receber e retornar double.
    public double top(double[] pilha){
        
        if(this.isEmpty() == false){
            return pilha[this.topo];  
        }else{
            System.out.println("Pilha vazia");
            return 0.0;
        }
    }   
    
}//Fim da classe pilha.
