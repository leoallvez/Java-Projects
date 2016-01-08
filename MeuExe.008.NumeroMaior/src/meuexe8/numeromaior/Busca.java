package meuexe8.numeromaior;

/**
 * Essa classe possui um metodo que compara se um número é maior.
 * @author Leonardo Pereira Alves
 * @version 18.02.2015
 */
public class Busca {
    private int numero;
    
    public int ComparaSeMaior(int valor){
        if(valor > this.numero){
            this.numero = valor;
            return this.numero;
        }else{
            return this.numero;
        }
    }   
}
