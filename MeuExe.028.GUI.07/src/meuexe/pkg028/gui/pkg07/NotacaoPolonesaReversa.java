
/*
 * Esse Programa implementa a conversão de infixa e pósfixa herdando os metodos
   e atributos da classe pilha.
 */
package meuexe.pkg028.gui.pkg07;

import static java.lang.String.valueOf;

/**
 * Estrutura de Dados
 * @author Leonardo Pereira Alves.
 * @version 14.03.15
 * atulizado 04.04.04
 */
public class NotacaoPolonesaReversa extends Pilha {

    public NotacaoPolonesaReversa(int max) {
        super(max);
    }
    
    
    // Esse metodo determina a prioridade de um operador.
    private int prio(char s){
        int result = 0;
        switch(s){
            case '(' : result = 0; break;
            case '+' : case '-' : result = 1; break;
            case '/' : case '*' : result = 2; break;
        }
        return result;
    }
    
    // Esse metodo converte uma notação de infixa em pósfixa.
    public String posfixa(String e){
        Check x = new Check();
        char [] p = new char[max]; // Vetor de char que será usado na pilha.
        String s = ""; // Variavel que guarda a saida.
        
        //Int inicia uma pilha vazia.
        Int();
        for(int i = 0; i < e.length(); i++){
            /** O metodo charAt() retorna um char de uma string com base na
             * posição passada como parametro.
             */
            // Ao achar um operador copia na saida.
            if(x.checkLetter(e.charAt(i)) == true){
                s = s + " "+ e.charAt(i);
            }else{
              /** Se for operação:
                * 1) Enquanto o topo tem uma operação com propriedade maior ou 
                * igual a operação em questão - desempilha na saida.
                */
                if(x.checkOperations(e.charAt(i)) ==  true){
                    
                    int a = prio(top(p)); // top retorna o elemento no topo. 
                    int b = prio(e.charAt(i));
                    
                    while (!isEmpty() && (a >= b)){ // && (top(p) != '(')){ 
                        
                        s = s + " "+ pop(p); //retirar elemento da pilha e coloca na saida.
                        a = prio(top(p)); // top retorna o elemento no topo. 
                        b = prio(e.charAt(i));
                    }
                    //2) Empilha a operação.
                    push(p,e.charAt(i)); //adiciona um elemento na pilha.   
                }else{
                    // Se for '(' empilha.
                    if(e.charAt(i) == '('){
                        push(p,e.charAt(i)); //adicionar '(' na pilha
                    }else{
                        // Se for ')' Desempilha na saida até encontrar um '('
                        if(e.charAt(i) == ')'){
                            while((top(p) != '(') && (false == isEmpty())){
                                s = s + " " + pop(p);
                                if(top(p) == '('){
                                    pop(p);
                                    break;
                                } 
                            }
                        }
                    }
                }
            }//Fim do if encadeado.
        }//Fim do for.
        //Ao terminar de varrer a expressão desempilha na saida até pilha vazia.
        while(isEmpty() != true){s = s +" "+ pop(p);}
        return s;
    }//Fim do metodo posfixa
    
    // Metodo converte uma conotação de Pósfixa para Infixa.
    public String infixa(String e){
        Check x = new Check();
        String [] p = new String[max]; // Vetor de char que será usado na pilha.
        String s = ""; // Varial que guarda a saida.
        
        //Int inicia uma pilha vazia.
        Int();
        for(int i = 0; i < e.length(); i++){
            if(x.checkLetter(e.charAt(i)) == true){
                push(p,valueOf(e.charAt(i)));
            }else{
                if(x.checkOperations(e.charAt(i)) == true){
                    String a = pop(p);
                    String b = pop(p);
                    push(p,"( "+b+" "+valueOf(e.charAt(i))+" "+a+" )");
                }
            }
        }
        while(isEmpty() != true && top(p) != null){s = s + pop(p);}
        return s;
    }
            
}//Fim da classe.
